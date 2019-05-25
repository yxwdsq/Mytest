package com.install;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.install.model.AdminUser;
import com.install.model.AmePerson;
import com.install.model.JapanPerson;
import com.install.model.Printable;
import com.install.model.Result;
import com.install.model.User;

public class MyApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		User.getAccount();
		User tom = new User("Tom",10);
//		tom = new User();
		System.out.println(tom.getUsername());
		tom.setUsername("github");
		tom.sayHi();

		AdminUser adminUs = new AdminUser("Bob",100);
//		System.out.println(adminUs.sayHi());
		adminUs.sayHi();
		adminUs.setUsername("jerry");
		adminUs.sayHello();

		tom.setScores(100);
		System.out.println(tom.getScores());
		tom.setScores(20);
		System.out.println(tom.getScores());
		tom.setScores(-10);
		System.out.println(tom.getScores());
		System.out.println(User.getAccount());
		User.getVersion();

		JapanPerson jp = new JapanPerson();
		jp.sayhe();
		AmePerson ap = new AmePerson();
		ap.sayhe();

		Printable pa = new Printable();
		pa.printa();
		pa.getInfo();

		Result rest;
		rest = Result.ERROR;

		switch (rest) {
		case SUCESS:
			System.out.println("result is ok!");
			System.out.println(rest.ordinal());
			break;
		case ERROR:
			System.out.println("result is NG");
			System.out.println(rest.ordinal());
			break;
		}

		// 36 lesson start
		String s1 = "abc";
		String s2 = "abc";
		String ss1 = new String("abc");
		String ss2 = new String("abc");

		if (s1 == s2) System.out.println("s1 == s2 address same!");
		if (s1.equals(s2)) System.out.println("s1 equals s2 contents same!");
		if (ss1 == ss2) {
			System.out.println("ss1 == ss2 address same!");
		} else {
			System.out.println("ss1 == ss2 address diffrent!");
		}
		if (ss1.equals(ss2)) System.out.println("ss1 equals ss2 contents same!");
		if (ss1.contentEquals(ss2)) System.out.println("ss1 contentequals ss2 contents same!");
//		if (ss1.Equals(s1)) System.out.println("ss1 contentequals ss2 contents same!");
		if (ss1 == s1) {
			System.out.println("ss1 == s1 adress same!");
		} else {
			System.out.println("ss1 == s1 adress diffrent!");
		}

		String sss = "abcabcedfedf";
		System.out.println(sss.length());
		System.out.println(sss.substring(2) + "---" + sss.substring(4, 6));
		System.out.println(sss.replace("ab", "AB") + "---" + sss.replaceAll("ab", "XY"));
		System.out.println(sss.indexOf("ab") + "---" + sss.indexOf("ab", 2));

		//# 37
		int stuno = 120;
		double egoscore = 120.5;
		String stunam = "tom";

		System.out.printf("name: %s,number: %d,scores:%f\n", stunam,stuno,egoscore);
		System.out.printf("name: %-10s,number: %10d,scores:%5.2f\n", stunam,stuno,egoscore);
		String sinfo = String.format("name: %10s,number: %-10d,scores:%5.2f\n", stunam,stuno,egoscore);
		System.out.println(sinfo);

		//# 38
		double data1 = 55.6;
		System.out.println(Math.ceil(data1));
		System.out.println(Math.floor(data1));
		System.out.println(Math.round(data1));
		System.out.println(Math.PI);
		//random

		Random ran = new Random();
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextBoolean());

		//# 39 List arraylist
		List <Integer> ar1 = new ArrayList<>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);

		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}

		ar1.set(1, 200);
		ar1.remove(0);

		for (Integer ar : ar1) {
			System.out.println(ar);
		}

		System.out.println("ListIterator loop");
		ListIterator<Integer> it = ar1.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		//List linkedlist
		System.out.println("LinkedList loop");
		List<String> st1 = new LinkedList<>();
		st1.add("tom");
		st1.add("jerry");
		st1.add("ego");

		for (String st : st1) {
			System.out.println(st);
		}

		//hashset
//		HashSet<Integer> hs = new HashSet<>();
		Set<Integer> hs = new HashSet<>();
		hs.add(100);
		hs.add(300);
		hs.add(200);
		hs.add(200);

		System.out.println(hs.size());
		for (Integer hs1 : hs) {
			System.out.println(hs1);
		}
		hs.remove(100);
		for (Integer hs1 : hs) {
			System.out.println(hs1);
		}

		//hashmap
//		HashMap<String,Integer> hm = new HashMap<>();
		Map<String,Integer> hm = new HashMap<>();

		hm.put("tom",10);
		hm.put("jerry",20);
		hm.put("ego",10);

		for (Map.Entry<String,Integer> hm1 : hm.entrySet()) {
			System.out.println(hm1.getKey()+":"+hm1.getValue());
		}
		//set interface get entryset,get key and value
		int years = ((Integer)hm.get("tom")).intValue();
		System.out.println(years+" size :" + hm.size());
		hm.put("tom", 40);
		hm.remove("ego");
		Set set = hm.entrySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			Map.Entry me = (Map.Entry)ite.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}

		//Stream Ramda
		List<Integer> al1 = new ArrayList<>(Arrays.asList(12,8,9,15));

		ListIterator<Integer> lit = al1.listIterator();
		while (lit.hasNext()) {
			System.out.println("ListIterator:" + lit.next());
		}
		for (Integer ali : al1) {
			if ((ali % 3) == 0) {
			System.out.println("for:" + ali);
			}
		}

		al1
			.stream()
			//中間処理
			.filter(e -> e % 3 == 0)
			.map(e -> "("+ e + ")")
			//終端処理
			.forEach(System.out::println);


	}

}
