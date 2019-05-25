package com.install;

import java.util.List;
import java.util.ListIterator;

import JDBCproject.ObjectTable.ObjDML;
import JDBCproject.ObjectTable.ObjTablea;

public class MyDatabaseTran {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String sqlString = "";
		List<ObjTablea> objListResult = null;
//		ObjTablea objTablea= null;
		ObjDML objDML = null;
		ListIterator<ObjTablea>  ite = null;

		sqlString = "select id ,name ,address ,mail from pig_user_test";

		objDML = new ObjDML();
		try {
			objListResult = objDML.select(sqlString);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		ite = objListResult.listIterator();

//		while (ite.hasNext()) {
//			objTablea = ite.next();
//			System.out.println("ID:" + objTablea.getId() + ",NAME:" + objTablea.getName() +
//					",ADDRESS:" + objTablea.getAddress() + ",MAIL:" + objTablea.getMail());
//		}

		sqlString = "insert into pig_user_test(id,name,address,mail) values()";

	}

}
