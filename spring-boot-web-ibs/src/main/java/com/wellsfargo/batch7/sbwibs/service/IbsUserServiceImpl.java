package com.wellsfargo.batch7.sbwibs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.IbsUserModel;
import com.wellsfargo.batch7.sbwibs.repo.IbsUserRepo;
import com.wellsfargo.batch7.sbwibs.util.EMParser;

@Service
public class IbsUserServiceImpl implements IbsUserService {

	
	@Autowired
	private IbsUserRepo iuRepo;
	
	@Transactional
	@Override
	public IbsUserModel add(IbsUserModel ibsuser) throws IBSException {
		if(ibsuser!=null) {
			if(iuRepo.existsById(ibsuser.getUserId())) {
				throw new IBSException("UserID#"+ibsuser.getUserId()+" already exists");
			}
			ibsuser = EMParser.parse(iuRepo.save(EMParser.parse(ibsuser)));
		}
		return ibsuser;
	}

}
