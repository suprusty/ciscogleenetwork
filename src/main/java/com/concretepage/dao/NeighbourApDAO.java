package com.concretepage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.NeighbourAP;

@Transactional
@Repository
public class NeighbourApDAO implements INeighbourApDAO {

	@PersistenceContext	
	private EntityManager entityManager;	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<NeighbourAP> getNeighbourApDetails() {
		String hql = "FROM NeighbourAP ";
		return (List<NeighbourAP>) entityManager.createQuery(hql).getResultList();
	}
}
