package com.generics.dao;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.generics.domain.BaseObject;

@Repository
public interface GenericDao <T extends BaseObject, ID extends Serializable> extends  PagingAndSortingRepository<T,ID>{

}
