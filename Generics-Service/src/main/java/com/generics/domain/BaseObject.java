package com.generics.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class BaseObject implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2686186108463472687L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseObject [id=" + id + "]";
	}
	
	

}
