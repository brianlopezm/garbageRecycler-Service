package com.brian.gargageRecycler.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.brian.gargageRecycler.model.UserRecycling;

@RepositoryRestResource(exported = false)
public interface UserRepository extends PagingAndSortingRepository<UserRecycling, Long> {
	
	List <UserRecycling> findBy();
	List <UserRecycling> findByUserName(String userName);
}
