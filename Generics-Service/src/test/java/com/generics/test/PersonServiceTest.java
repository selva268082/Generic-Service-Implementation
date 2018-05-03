package com.generics.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.generics.domain.ContactInfo;
import com.generics.domain.Person;
import com.generics.service.ContactService;
import com.generics.service.PersonService;

public class PersonServiceTest extends BaseTest {
	
	@Autowired
	PersonService personService;
	
    @Test
    public void testContactCount(){
    	System.out.println("Count------><--------"+ personService.count());
    	
    	List<Person> contactInfoLst= personService.findAll();
    	
    	contactInfoLst.stream().forEach(e-> System.out.println(e));
    }
}
