package com.generics.dao;

import org.springframework.stereotype.Repository;

import com.generics.domain.Person;

@Repository("personDao")
public interface PersonDao extends GenericDao<Person,Long>{

}
