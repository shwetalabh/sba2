package com.wellsfargo.batch7.sbwibs.service;

import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.IbsUserModel;

public interface IbsUserService {
	
	IbsUserModel add(IbsUserModel ibsuser) throws IBSException;

}
