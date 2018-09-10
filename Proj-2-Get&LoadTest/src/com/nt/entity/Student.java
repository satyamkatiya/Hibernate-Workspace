package com.nt.entity;

import java.io.Serializable;

public class Student implements Serializable {
	
	/* Student property */
	
	private int sid =0;
	private String sname = null;
	private String addr = null;
	
	/* setter and getter methods */
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
