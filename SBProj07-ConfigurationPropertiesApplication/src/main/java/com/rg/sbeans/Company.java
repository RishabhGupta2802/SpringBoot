package com.rg.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("comp")
@Setter
@ToString
@ConfigurationProperties(prefix="org.rg")
public class Company {
	private String name;
	private String addrs;
	private Long pincode;
	private Long contact;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", addrs=" + addrs + ", pincode=" + pincode + ", contact=" + contact + "]";
	}
	

}
