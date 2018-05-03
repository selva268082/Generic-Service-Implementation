package com.generics.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PERSON_INFO")
public class Person extends BaseObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4986624511481908912L;
	
	@Column(name="PERSON_NAME")
	private String personName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PERSON_DOB")
	private Date dob;
	
	@OneToOne
	//@JoinColumn(name="CUST_INFO")
	@PrimaryKeyJoinColumn
	private ContactInfo custInfo;
	
	
	
	public ContactInfo getCustInfo() {
		return custInfo;
	}

	public void setCustInfo(ContactInfo custInfo) {
		this.custInfo = custInfo;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", dob=" + dob + ", custInfo=" + custInfo + "]";
	}

 
}
