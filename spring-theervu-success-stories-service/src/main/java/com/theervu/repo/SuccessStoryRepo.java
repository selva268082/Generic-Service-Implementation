package com.theervu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theervu.dto.SuccessStories;

public interface SuccessStoryRepo extends JpaRepository<SuccessStories, Integer> {

}
