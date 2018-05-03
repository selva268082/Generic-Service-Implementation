package com.generics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generics.dao.ContactDao;
import com.generics.domain.ContactInfo;

@Service
public class ContactService  extends GenericServiceImpl<ContactInfo,Long>{

	@Autowired
	ContactDao contactDao;
}
