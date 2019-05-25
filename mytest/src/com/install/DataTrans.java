package com.install;

import com.install.model.CheckString;
import com.install.model.WriteFile;

import JDBCproject.ObjectTable.FileIO;

public class DataTrans {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String stringColumn = "20190315";
		String stringColumnNew = "";
		Boolean stringflag = null;

		stringflag = CheckString.checkColumn(stringColumn);
		if (! stringflag) {
			WriteFile.writeFile("C:\\test.log", "stringColumn is empty,please check!");
			System.out.println("stringColumn is empty,please check!");
		} else {
			stringColumnNew = CheckString.dateFormat(stringColumn);
			System.out.println("stringColumn is " + stringColumnNew);
		}
		FileIO.logFileRead("C:\\test.log");

	}

}
