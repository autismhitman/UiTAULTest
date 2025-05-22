package com.ui.pojos;

public class Address {
	
	private String address_line;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String mobile;
	private String alias;
	
	
	public String getAddress_line() {
		return address_line;
	}
	public void setAddress_line(String address_line) {
		this.address_line = address_line;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Address(String address_line, String city, String state, String zip, String phone, String mobile,
			String alias) {
		super();
		this.address_line = address_line;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.mobile = mobile;
		this.alias = alias;
	}
	@Override
	public String toString() {
		return "Address [address_line=" + address_line + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", phone=" + phone + ", mobile=" + mobile + ", alias=" + alias + "]";
	}
	
	
	
	
	
	
	
	
	
}
