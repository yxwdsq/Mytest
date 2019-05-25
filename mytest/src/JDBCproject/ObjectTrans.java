package JDBCproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCproject.ObjectTable.ObjTablea;

class ObjTable {
	public static final String DBDRIVER = "orace.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521.orcl";
	public static final String DBUSER = "pos";
	public static final String PASSWORD = "java";

	Connection conn = null;
	PreparedStatement pstmt= null;
	ResultSet result = null;

	public Connection init() throws Exception{
		try {
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
		System.out.println("database connect success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void close() throws Exception {
		try {
		result.close();
		pstmt.close();
		conn.close();
		System.out.println("database closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public List<ObjTablea> select(String sqlString) throws Exception {

		pstmt = conn.prepareStatement(sqlString);
		result = pstmt.executeQuery();
		List<ObjTablea> listtablea = new ArrayList<>();

		ObjTablea obja = null;
		while (result.next()) {
			obja = new ObjTablea();
			obja.setId(result.getInt(1));
			obja.setName(result.getString(2));
			obja.setAddress(result.getString(3));
			obja.setMail(result.getString(4));
			listtablea.add(obja);
		}
		return listtablea;
	}

	public void update(ObjTablea o,String sqlString) throws Exception{
		ObjTablea obja = o;
		pstmt = conn.prepareStatement(sqlString);
		pstmt.setInt(1, obja.getId());
		pstmt.setString(2, obja.getName());
		pstmt.setString(3, obja.getAddress());
		pstmt.setString(4, obja.getMail());
		pstmt.executeUpdate();
	}
}

public class ObjectTrans {



	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		ObjTable objt = new ObjTable();
		objt.init();

		List<ObjTablea> oaList = null;
		String sqlString = "select id,name,adress,mail from tablea";
		oaList = objt.select(sqlString);
		for (ObjTablea oatmp : oaList) {
			System.out.println(oatmp.getId());
			System.out.println(oatmp.getName());
			System.out.println(oatmp.getAddress());
			System.out.println(oatmp.getMail());
			System.out.println();
		}

	}

}
