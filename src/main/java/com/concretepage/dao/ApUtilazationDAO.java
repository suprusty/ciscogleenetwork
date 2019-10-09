package com.concretepage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.APData;
@Transactional
@Repository
public class ApUtilazationDAO implements IApUtilazationDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<APData> getApUtilazationDetails() {
		String hql = "FROM APData ";
		return (List<APData>) entityManager.createQuery(hql).getResultList();
	}	
	
}
