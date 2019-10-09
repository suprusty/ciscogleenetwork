package com.concretepage.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="apdata")
public class APData implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private int id;  
	@Column(name="ap_name")
    private String apName;
	
	@Column(name="client_24ghz")	
	private int client24ghz;
	
	@Column(name="client_5ghz")	
	private int client5ghz;
	
	@Column(name="channel_24ghz")	
	private int channel24ghz;
	
	@Column(name="cochannel")	
	private String cochannel;
	
	@Column(name="adjchannel")	
	private String adjchannel;
	
	@Column(name="rouge")	
	private int rouge;
	
	@Column(name="interferer")	
	private int interferer;
	
	@Column(name="channel_utilization")	
	private String channelUtilization;
	
	@Column(name="ssid_count")	
	private int ssidCount;
	
	@Column(name="prodesc")	
	private String proDesc;
	
	
	@Column(name="solution")	
	private String solution;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApName() {
		return apName;
	}

	public void setApName(String apName) {
		this.apName = apName;
	}

	public int getClient24ghz() {
		return client24ghz;
	}

	public void setClient24ghz(int client24ghz) {
		this.client24ghz = client24ghz;
	}

	public int getClient5ghz() {
		return client5ghz;
	}

	public void setClient5ghz(int client5ghz) {
		this.client5ghz = client5ghz;
	}

	public int getChannel24ghz() {
		return channel24ghz;
	}

	public void setChannel24ghz(int channel24ghz) {
		this.channel24ghz = channel24ghz;
	}

	public String getCochannel() {
		return cochannel;
	}

	public void setCochannel(String cochannel) {
		this.cochannel = cochannel;
	}

	public String getAdjchannel() {
		return adjchannel;
	}

	public void setAdjchannel(String adjchannel) {
		this.adjchannel = adjchannel;
	}

	public int getRouge() {
		return rouge;
	}

	public void setRouge(int rouge) {
		this.rouge = rouge;
	}

	public int getInterferer() {
		return interferer;
	}

	public void setInterferer(int interferer) {
		this.interferer = interferer;
	}

	public String getChannelUtilization() {
		return channelUtilization;
	}

	public void setChannelUtilization(String channelUtilization) {
		this.channelUtilization = channelUtilization;
	}

	public int getSsidCount() {
		return ssidCount;
	}

	public void setSsidCount(int ssidCount) {
		this.ssidCount = ssidCount;
	}

	public String getProDesc() {
		return proDesc;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
} 