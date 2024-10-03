package com.productinfo;

public class SuperMarket {

	private int s_id;
	private String s_name;
	private String loc;
	public SuperMarket() {
		super();
	}
	public SuperMarket(int s_id, String s_name, String loc) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.loc = loc;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String toString() {
		return "SuperMarket [s_id=" + s_id + ", s_name=" + s_name + ", loc=" + loc + "]";
	}
	
	
	
	
}
