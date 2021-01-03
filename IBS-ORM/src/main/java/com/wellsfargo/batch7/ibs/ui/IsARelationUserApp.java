package com.wellsfargo.batch7.ibs.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.wellsfargo.batch7.ibs.entities.IbsUser;
import com.wellsfargo.batch7.ibs.util.JpaUtil;

public class IsARelationUserApp {

	public static void main(String[] args) {

		IbsUser u1 = new IbsUser(null, "usr2", "pwd2", "Customer");	

		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(u1);
		txn.commit();
		em.close();
	}
}
