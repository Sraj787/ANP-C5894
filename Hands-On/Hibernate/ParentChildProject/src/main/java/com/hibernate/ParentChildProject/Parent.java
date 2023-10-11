package com.hibernate.ParentChildProject;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Parent {
	@Id
	private int pId;
	@Column
	private String pName;
	@OneToMany
	private Set<Child> child;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Set<Child> getChild() {
		return child;
	}
	public void setChild(Set<Child> child) {
		this.child = child;
	}
	@Override
	public String toString() {
		return "Parent [pId=" + pId + ", pName=" + pName + ", child=" + child + "]";
	}
	
}
