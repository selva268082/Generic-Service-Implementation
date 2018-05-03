package com.generics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
//@Table(name="CONTACT_INFO")
public class ContactInfo extends BaseObject{

	private static final long serialVersionUID = -6024161681575623687L;
	
	@Column(name="PERSON_CONTACT_ADDR")
	private String addr;
	@Column(name="PERSON_CONTACT_NO")
	private String phone;

	
	 
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "ContactInfo [addr=" + addr + ", phone=" + phone + "]";
	}
	
	
 
	

}
