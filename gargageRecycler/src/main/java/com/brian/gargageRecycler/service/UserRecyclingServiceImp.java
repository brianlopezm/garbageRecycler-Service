package com.brian.gargageRecycler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.gargageRecycler.model.UserRecycling;
import com.brian.gargageRecycler.repository.UserRepository;
@Service
public class UserRecyclingServiceImp implements UserRecyclingService {
	@Autowired
	UserRepository urepo;

	@Override
	public UserRecycling addUserRecycling(UserRecycling ur) {
		return urepo.save(ur);
	}

	@Override
	public List<UserRecycling> getAllUserRecycling(String userName) {
		
		return urepo.findByUserName(userName);
	}
	

}
