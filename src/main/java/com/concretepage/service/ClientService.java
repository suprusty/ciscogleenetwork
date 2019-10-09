package com.concretepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IClientDAO;
import com.concretepage.entity.Client;

@Service
public class ClientService implements IClientService{

	@Autowired
	private IClientDAO clientDao;
	@Override
	public List<Client> getClients() {
		return clientDao.getClients();
	}

}
