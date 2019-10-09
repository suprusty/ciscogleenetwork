package com.concretepage.service;

import java.util.List;
import java.util.Map;

import com.concretepage.entity.APData;
import com.concretepage.entity.NeighbourAP;

public interface IApNeighbourService {
	     Map<APData, List<NeighbourAP>> getNeighbourApDetails();
}
