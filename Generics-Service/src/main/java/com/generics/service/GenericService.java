package com.generics.service;

import java.io.Serializable;
import java.util.List;

import com.generics.domain.BaseObject;

public interface GenericService <T extends BaseObject,ID extends Serializable> {
 
	 T findById(ID id);
	 List<T> findAll();
	 long count();
	 T save(T entity);
	 void delete(ID id);
	 
}
