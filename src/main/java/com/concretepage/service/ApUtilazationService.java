package com.concretepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IApUtilazationDAO;
import com.concretepage.entity.APData;
import com.concretepage.entity.Article;
@Service
public class ApUtilazationService implements IApUtilazationService {
	@Autowired
	private IApUtilazationDAO apUtilazationDAO;
	@Override
	public List<APData> getApUtilazationDetails(){
		return apUtilazationDAO.getApUtilazationDetails();
	}
	
}
