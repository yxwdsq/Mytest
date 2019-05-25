package com.install.model;

public class CheckString {

	private static String columnsFormat = "";

	public static boolean checkColumn(String column) {
		if (column == null || column.equals("")) {
			return false;
		} else {
			return true;
		}
	}

	public static String dateFormat(String column) {
		if (column.length() == 8) {
			columnsFormat = column.substring(0,4) + "/" + column.substring(4,6) + "/" + column.substring(6,8);
		}
		return columnsFormat;
	}

}
