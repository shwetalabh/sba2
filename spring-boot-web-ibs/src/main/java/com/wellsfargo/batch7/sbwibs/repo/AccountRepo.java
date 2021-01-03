package com.wellsfargo.batch7.sbwibs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.sbwibs.entity.AccountEntity;
import com.wellsfargo.batch7.sbwibs.entity.CustomerEntity;

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity, Long> {

	List<AccountEntity> findAllByCustomer(CustomerEntity customer);
	
	@Query(value="select * from ibs_accounts a where a.acc_type='savings'and a.uid=:customerId",nativeQuery = true)
	List<AccountEntity> findAllSavingsAccountByCustomer(@Param("customerId")Long customerId);
	
	@Query(value="select * from ibs_accounts a where a.acc_type='fixeddeposit' and a.uid=:customerId",nativeQuery = true)
	List<AccountEntity> findAllFixedDepositByCustomer(@Param("customerId")Long customerId);

	@Query(value="select * from ibs_accounts a where a.acc_type='recurringdeposit' and a.uid=:customerId",nativeQuery = true)
	List<AccountEntity> findAllRecurringDepositByCustomer(@Param("customerId")Long customerId);
	
}


