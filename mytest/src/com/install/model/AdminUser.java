package com.install.model;

public class AdminUser extends User {

	public AdminUser(String name,int scores) {
		super(name,scores);
	}

	public void sayHello() {
		System.out.println("hello !" + super.getUsername());
	}

	@Override
	public void sayHi() {
		System.out.println("[Admin]hi !" + this.scores);
	}
}
