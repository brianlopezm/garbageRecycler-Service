package com.brian.gargageRecycler.service;

import java.util.List;


import com.brian.gargageRecycler.model.UserRecycling;

public interface UserRecyclingService {
	
	UserRecycling addUserRecycling(UserRecycling ur);
	
	List<UserRecycling> getAllUserRecycling(String userName);
	
}
