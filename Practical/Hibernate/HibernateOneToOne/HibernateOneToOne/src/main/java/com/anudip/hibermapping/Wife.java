package com.anudip.hibermapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Wife {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wId;
	@Column(name="Wife_Name")
	private String wName;
	
	@OneToOne
	private Husband husband;
	
	public int getwId() {
		return wId;
	}
	public void setwId(int wId) {
		this.wId = wId;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public Husband getHusband() {
		return husband;
	}
	public void setHusband(Husband husband) {
		this.husband = husband;
	}
	@Override
	public String toString() {
		return "Wife [wId=" + wId + ", wName=" + wName + ", husband=" + husband + "]";
	}
	
	
	
}
