package com.install;

import java.util.List;

import JDBCproject.ObjectTable.ObjDML;
import JDBCproject.ObjectTable.ObjTablea;
import utils.JdbcUtils;

public class DBProcedure {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			JdbcUtils.getconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String sqlString = "select id,name,address,mail from tablea";
		ObjDML objdml = new ObjDML();

		try {
			List<ObjTablea> listObj = null;
			listObj = objdml.select(sqlString);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
