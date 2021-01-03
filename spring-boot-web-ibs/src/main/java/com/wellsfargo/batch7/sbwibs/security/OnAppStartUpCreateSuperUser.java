package com.wellsfargo.batch7.sbwibs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.wellsfargo.batch7.sbwibs.entity.IbsUserEntity;
import com.wellsfargo.batch7.sbwibs.repo.IbsUserRepo;

@Component
public class OnAppStartUpCreateSuperUser {

	@Autowired
	private IbsUserRepo userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@EventListener
	public void createSuperUserOnStartUp(ApplicationStartedEvent event) {
		if(!userRepo.existsByUserName("BankRep")) {
			userRepo.save(new IbsUserEntity(null, 
					"BankRep", encoder.encode("BankRep"),"ADMIN"));
		}
	}
	
	
}

