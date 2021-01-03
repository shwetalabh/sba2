package com.wellsfargo.batch7.sbwibs.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.sbwibs.entity.IbsUserEntity;

@Repository
public interface IbsUserRepo extends JpaRepository<IbsUserEntity, Long> {

	boolean existsByUserName(String username);
	
	IbsUserEntity findByUserName(String userName);
}
