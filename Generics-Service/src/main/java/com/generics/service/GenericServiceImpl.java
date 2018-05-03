package com.generics.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.generics.dao.GenericDao;
import com.generics.domain.BaseObject;

@Service
@Transactional
public class GenericServiceImpl<T extends BaseObject, Id extends Serializable> implements GenericService<T,Id>{
    
	@Autowired
	private GenericDao<T, Id> genericDao;
	
	public GenericServiceImpl() {
		super();
	}
		
	public GenericServiceImpl(GenericDao<T, Id> dao) {
		super();
		this.genericDao = dao;
	}
	@Transactional(readOnly=true)
	public T findById(Id id) {
		
		return genericDao.findOne(id);
	}
	@Transactional(readOnly=true)
	public List<T> findAll() {
		
		return (List<T>) genericDao.findAll();
	}
	
	@Transactional(readOnly=true)
	public long count() {
		
		return genericDao.count();
	}
	@Transactional 
	public T save(T entity) {
		
		return genericDao.save(entity);
	}
	@Transactional
	public void delete(Id id) {
		
		genericDao.delete(id);
		
		
	}
	

}
