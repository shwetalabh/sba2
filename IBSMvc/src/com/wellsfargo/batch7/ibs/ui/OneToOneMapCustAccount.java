package com.wellsfargo.batch7.ibs.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.wellsfargo.batch7.ibs.entities.Account;
import com.wellsfargo.batch7.ibs.entities.Customer;
import com.wellsfargo.batch7.ibs.util.JpaUtil;

public class OneToOneMapCustAccount {

	public static void main(String[] args) {
		Customer customer =new Customer(null,"user1","pwd1","Customer","Rahul","01/03/1985","9984569711","RT Nagar,Bangalore","user1@gmail.com","tcpwd1");
//		customer.setSavAccount(new Account("10101L","savings","300000.00",null,"01/01/2020",null,null,null,null,null,"300000.00",customer));
		customer.setSavAccount(new Account());
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();		
		em.persist(customer);
		txn.commit();
		em.close();
	}
	}


