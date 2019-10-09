package com.concretepage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="neighbourap")
public class NeighbourAP {
	private static final long serialVersionUID = 1L;

	@Column(name="ap_name")
    private String apName;
	
	@Column(name="cochannel")	
	private String cochannel;
	
	public String getApName() {
		return apName;
	}

	public void setApName(String apName) {
		this.apName = apName;
	}
	
	public String getCochannel() {
		return cochannel;
	}

	public void setCochannel(String cochannel) {
		this.cochannel = cochannel;
	}
	
}
