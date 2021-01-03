package com.wellsfargo.batch7.sbwibs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.sbwibs.entity.AccountEntity;
import com.wellsfargo.batch7.sbwibs.entity.CustomerEntity;
import com.wellsfargo.batch7.sbwibs.entity.FundTransferEntity;

@Repository
public interface FundTransferRepo extends JpaRepository<FundTransferEntity, Long> {

	List<FundTransferEntity> findAllByAccount(AccountEntity account);
	
	
	
	
	
	
	
}


