package com.generics.service;

import org.springframework.stereotype.Service;

import com.generics.domain.Person;

@Service
public class PersonService extends GenericServiceImpl<Person,Long>{

}
