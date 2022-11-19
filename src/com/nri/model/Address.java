package com.nri.model;

public class Address {
	private int aid;
	private String streetname;
	private String city;
	private String state;
	private double zipcode;
	
	
	public Address() {
		super();
	}

	public Address(int aid, String streetname, String city, String state, double zipcode) {
		super();
		this.aid = aid;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}


	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getZipcode() {
		return zipcode;
	}
	public void setZipcode(double zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", streetname=" + streetname + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	
}
