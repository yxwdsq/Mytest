package com.install.model;

public class User {
	private String name;
	protected int scores;
	public static int account;
	private static final double VERSION = 1.1;

	static {
		User.account = 0;
		System.out.println("static initializer!");
	}

	{
		System.out.println("instance initializer!");
	}

	User() {
//		this.name="Me!";
		this("Me!",0);
	}

	public User(String name,int scores) {
		this.name = name;
		this.scores = scores;
		User.account++;
		System.out.println("====constractor====");
	}

	public void sayHi() {
		System.out.println("hi !"+this.name);
	}
	public void setUsername(String name) {
		this.name = name;
	}
	public String getUsername() {
		return name;
	}
	public int getScores() {
		return this.scores;
	}
	public void setScores(int scores) {
		if (scores > 0) {
			this.scores = scores;
		}
	}
	public static int getAccount() {
		System.out.println("# of instance number :" + User.account);
		return User.account;
	}
	public static void getVersion() {
		System.out.println("now verson:" + User.VERSION);
	}

}
