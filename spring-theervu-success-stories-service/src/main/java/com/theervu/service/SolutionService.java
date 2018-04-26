package com.theervu.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.theervu.dto.SuccessStories;

public interface SolutionService {

	List<SuccessStories> findAllSuccessStories() throws DataAccessException;

}
