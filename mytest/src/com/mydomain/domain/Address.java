package com.mydomain.domain;

public class Address {

	private int id;
	private int accountid;
	private String addresses;

	public int getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;;
	}

	public int getAccountId() {
		return this.accountid;
	}

	public void setAccountId(Integer accountid) {
		this.accountid = accountid;
	}

	public String getAddresses() {
		return this.addresses;
	}

	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}
}