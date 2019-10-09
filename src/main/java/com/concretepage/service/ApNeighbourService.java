package com.concretepage.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IApUtilazationDAO;
import com.concretepage.dao.INeighbourApDAO;
import com.concretepage.entity.APData;
import com.concretepage.entity.NeighbourAP;

@Service
public class ApNeighbourService implements IApNeighbourService {
	
	@Autowired
	private INeighbourApDAO neighbourApDAO;
	@Autowired
	private IApUtilazationDAO apUtilazationDAO;
	
	
	@Override
	public  Map<APData, List<NeighbourAP>> getNeighbourApDetails() {
		Map<APData, List<NeighbourAP>> map = new HashMap<>();
		List<NeighbourAP> neighbourAccessPoints = neighbourApDAO.getNeighbourApDetails();
		List<APData> accessPoints = apUtilazationDAO.getApUtilazationDetails();
		
		for (APData ap : accessPoints) {
			Stream<NeighbourAP> napList = neighbourAccessPoints.stream()
					.filter((nap) -> nap.getCochannel() == ap.getCochannel());
			map.put(ap, napList.collect(Collectors.toList()));
		}
		return map;
	}
}
