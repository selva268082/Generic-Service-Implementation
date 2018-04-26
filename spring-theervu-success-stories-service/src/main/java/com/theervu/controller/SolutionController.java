package com.theervu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.theervu.dto.SuccessStories;
import com.theervu.service.SolutionService;


@RestController
public class SolutionController {
	@Autowired
	SolutionService solutionService;
	
	@RequestMapping(value="allsuccessstories",method=RequestMethod.GET)
	public ResponseEntity< List<SuccessStories>> findAllStories(){
		//
		
		  List<SuccessStories> successStoriesLst=	solutionService.findAllSuccessStories();
		
		
		return new ResponseEntity< List<SuccessStories>>(successStoriesLst,HttpStatus.OK);
		
	}
	

}
