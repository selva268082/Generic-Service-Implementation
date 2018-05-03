package com.generics.dao;

import org.springframework.stereotype.Repository;

import com.generics.domain.ContactInfo;

@Repository("contactDao")
public interface ContactDao extends GenericDao<ContactInfo,Long>{

}
