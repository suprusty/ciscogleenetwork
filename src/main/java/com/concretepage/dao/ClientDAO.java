package com.concretepage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Client;

@Transactional
@Repository
public class ClientDAO implements IClientDAO{

	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public List<Client> getClients() {
		String hql = "FROM client ";
		return (List<Client>) entityManager.createQuery(hql).getResultList();
	}

}
