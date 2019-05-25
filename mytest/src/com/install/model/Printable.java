package com.install.model;

interface UserPrint {
	//定数
	double VERSION = 2.1;
	//抽象メソッド
	void printa() ;
	//defaultメソッド
	public default void getInfo() {
		System.out.println("I/F version :" + UserPrint.VERSION);
	};
	//staticメソッド

}

public class Printable implements UserPrint {
	public void printa() {
		System.out.println("printa begin ...");
	}
}
