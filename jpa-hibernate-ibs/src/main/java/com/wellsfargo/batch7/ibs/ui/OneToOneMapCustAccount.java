package com.wellsfargo.batch7.ibs.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.wellsfargo.batch7.ibs.entities.Account;
import com.wellsfargo.batch7.ibs.entities.Customer;
import com.wellsfargo.batch7.ibs.util.JpaUtil;

public class OneToOneMapCustAccount {

	public static void main(String[] args) {
		Customer customer = new Customer(null, "user12", "pwd12", "Customer", "1234567890001","Rahul", "01/03/1985", "9984569711",
				"RT Nagar,Bangalore", "user1@gmail.com", "tcpwd1");
		
		LocalDate today = LocalDate.parse("2019-03-29");

		customer.setSavAccount(new Account("", "", 123.01, 1754.25, today, LocalDate.now(), 123.2, 1.11, 1.11, 1.11, 2.2));

		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(customer);
		txn.commit();
		em.close();
	}
}
