package com.wellsfargo.batch7.sbwibs.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.sbwibs.entity.IbsUserEntity;
import com.wellsfargo.batch7.sbwibs.entity.ServiceProviderEntity;

@Repository
public interface ServiceProviderRepo extends JpaRepository<ServiceProviderEntity, Long> {

	boolean existsByEmailId(String emailId);
	boolean existsByPhoneNumber(String phoneNumber);
	
	@Query(value="select * from ibs_serviceprovider s left join ibs_user_main u on s.uid=u.uid where s.reg_status=:status",nativeQuery=true)
	List<ServiceProviderEntity> getAllPendingApplications(@Param("status")String status);

	ServiceProviderEntity findByEmailId(String emailId);
	Optional<ServiceProviderEntity> findByUserName(String userName);

}


