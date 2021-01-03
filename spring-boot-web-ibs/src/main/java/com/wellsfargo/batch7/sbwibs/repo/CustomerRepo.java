package com.wellsfargo.batch7.sbwibs.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.sbwibs.entity.CustomerEntity;
import com.wellsfargo.batch7.sbwibs.model.CustomerModel;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {

	boolean existsByEmailId(String emailId);
	boolean existsByDateOfBirth(String dateOfBirth);
	CustomerEntity findByEmailId(String emailId);
	@Query(value="select * from ibs_customer c left join ibs_user_main u on c.uid=u.uid where c.reg_status=:status",nativeQuery=true)
	List<CustomerEntity> getAllPendingApplications(@Param("status") String status);
	boolean existsByPhoneNumber(String phoneNumber);
	Optional<CustomerEntity> findByUserName(String userName);

}


