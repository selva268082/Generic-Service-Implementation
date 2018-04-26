package com.theervu.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PERSON_ID")
	private int personId;
	
	@Column(name="PERSON_NAME")
	private String personName;
	
	@Column(name="PERSON_PLACE")
	private String personPlace;
	
/*	@ManyToOne
	@JoinColumn(name="STORY_ID")
	private SuccessStories stories;
		*/
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<AvailableFormat> availableFormat;
	/**
	 * @return the stories
	 */
	
/*	public SuccessStories getStories() {
		return stories;
	}*/
	/**
	 * @return the personPlace
	 */
	public String getPersonPlace() {
		return personPlace;
	}
	/**
	 * @param personPlace the personPlace to set
	 */
	public void setPersonPlace(String personPlace) {
		this.personPlace = personPlace;
	}
	/**
	 * @param stories the stories to set
	 */
/*	public void setStories(SuccessStories stories) {
		this.stories = stories;
	}*/
	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * @return the availableFormat
	 */
	public List<AvailableFormat> getAvailableFormat() {
		return availableFormat;
	}
	/**
	 * @param availableFormat the availableFormat to set
	 */
	public void setAvailableFormat(List<AvailableFormat> availableFormat) {
		this.availableFormat = availableFormat;
	}
 
	
}
