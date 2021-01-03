package com.wellsfargo.batch7.ibs.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.wellsfargo.batch7.ibs.entities.Account;
import com.wellsfargo.batch7.ibs.entities.Customer;
import com.wellsfargo.batch7.ibs.util.JpaUtil;

public class OneToOneMapCustAccount {

	public static void main(String[] args) {
		Customer customer =new Customer(null,"user4","pwd4","Customer","Rahul","01/03/1985","9984569712","RT Nagar Bangalore","user2@gmail.com","tcpwd1");
		//String accountNum, String accountType, Double amountDeposit, Double interestRate,
		//LocalDate depositDate, LocalDate maturityDate, Double interestReceived, Double timeInYears,
		//Double timeInMonths, Double maturityAmount, Double balanceAmt, Customer accountHolder)
		customer.setSavAccount(new Account("10102L","savings",300000.00,2.10,null,null,50000.00,2.0,48.0,300000.00,300000.00,customer));
		
		
		//customer.setSavAccount(new Account());
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();		
		em.persist(customer);
		txn.commit();
		em.close();
	}
	}


