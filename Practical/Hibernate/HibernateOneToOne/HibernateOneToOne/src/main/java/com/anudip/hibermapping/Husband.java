package com.anudip.hibermapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Husband {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hId;
	@Column(name="Husband_Name")
	private String hName;
	
	@OneToOne
	private Wife wife; //asscociation
	
	
	public int gethId() {
		return hId;
	}
	public void sethId(int hId) {
		this.hId = hId;
	}
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	
	@Override
	public String toString() {
		return "Husband [hId=" + hId + ", hName=" + hName + ", wife=" + wife + "]";
	}
	
	
}
