package com.concretepage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="client_mac")
	String client_mac;
	
	@Column(name="ap_name")
	String ap_name;
	
	@Column(name="protocol")
	int protocol;
	
	@Column(name="vendor")
	String venod;
	
	public Client(String client_mac, String ap_name, int protocol) {
		super();
		this.client_mac = client_mac;
		this.ap_name = ap_name;
		this.protocol = protocol;
	}

	public String getClient_mac() {
		return client_mac;
	}
	
	public void setClient_mac(String client_mac) {
		this.client_mac = client_mac;
	}
	
	public String getAp_name() {
		return ap_name;
	}
	
	public void setAp_name(String ap_name) {
		this.ap_name = ap_name;
	}
	
	public int getProtocol() {
		return protocol;
	}
	
	public void setProtocol(int protocol) {
		this.protocol = protocol;
	}
	
	public String getVenod() {
		return venod;
	}
	
	public void setVenod(String venod) {
		this.venod = venod;
	}
	
}
