package com.mydomain.domain;

public class Customer {

		private int id;
		private int accountid;
		private String name;
		private String adress;
		private String email;

		public int getId() {
			return this.id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getAccountid() {
			return this.accountid;
		}

		public void setAccountid(int accountid) {
			this.accountid = accountid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAdress() {
			return this.adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}
