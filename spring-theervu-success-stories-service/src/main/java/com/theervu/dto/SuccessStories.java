package com.theervu.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SUCCESS_STORIES")
public class SuccessStories {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STORY_ID")
	private int storyId;
	
	@Column(name="TYPE_OF_DISEASE")
	private String typeofdisease;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Person> person; 



	/**
	 * @return the storyId
	 */
	public int getStoryId() {
		return storyId;
	}

	/**
	 * @param storyId the storyId to set
	 */
	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	/**
	 * @return the typeofdisease
	 */
	public String getTypeofdisease() {
		return typeofdisease;
	}

	/**
	 * @param typeofdisease the typeofdisease to set
	 */
	public void setTypeofdisease(String typeofdisease) {
		this.typeofdisease = typeofdisease;
	}

	/**
	 * @return the person
	 */
	public List<Person> getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(List<Person> person) {
		this.person = person;
	}

}
