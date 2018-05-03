package com.generics.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.generics.domain.ContactInfo;
import com.generics.service.ContactService;

public class ContactServiceTest extends BaseTest {
	
	@Autowired
	ContactService contactService;
	
    @Test
    public void testContactCount(){
    	System.out.println("Count------><--------"+ contactService.count());
    	
    	List<ContactInfo> contactInfoLst= contactService.findAll();
    	
    	contactInfoLst.stream().forEach(e-> System.out.println(e));
    }
}
