package com.wellsfargo.batch7.ibs.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.wellsfargo.batch7.ibs.entities.Bank;
import com.wellsfargo.batch7.ibs.entities.Customer;
import com.wellsfargo.batch7.ibs.util.JpaUtil;

public class OneToManyMapping {

	public static void main(String[] args) {
		
		Bank b1 = new Bank(null, "admin1", "pwd123", "Bank","123",true,true);
		b1.setCustomer(new TreeSet<>());
		b1.getCustomer().add(new Customer(null, "user12", "pwd12", "Customer", "","Rahul", "01/03/1985", "9984569711",
				"RT Nagar,Bangalore", "user1@gmail.com", "tcpwd1"));
	
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(b1);
		txn.commit();
		em.close();
	}
}
