package com.theervu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.theervu.dto.SuccessStories;
import com.theervu.repo.SuccessStoryRepo;
import com.theervu.service.SolutionService;

@Component
public class SolutionServiceImpl implements SolutionService {
    
	@Autowired
	SuccessStoryRepo successStoryRepo;
	
	@Override
	public List<SuccessStories> findAllSuccessStories() {
		
		  List<SuccessStories> successStoriesLst= successStoryRepo.findAll();
		  
		  return successStoriesLst;
		 
	}

}
