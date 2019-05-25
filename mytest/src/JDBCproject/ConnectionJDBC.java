package JDBCproject;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import JDBCproject.ObjectTable.ObjTablea;

public class ConnectionJDBC {

	private static String dbdriver = null;
	private static String dburl = null;
	private static String dbuser = null;
	private static String dbpwd = null;


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		String sqlString = "";

		try {
			InputStream in = ConnectionJDBC.class.getClassLoader().getResourceAsStream("mysql.properties");
			Properties prop = new Properties();
			prop.load(in);

			dbdriver = prop.getProperty("dbdriver");
			dburl = prop.getProperty("dburl");
			dbuser = prop.getProperty("dbuser");
			dbpwd = prop.getProperty("dbpwd");

		Class.forName(dbdriver);

		ObjTablea objTablea = null;

		conn = DriverManager.getConnection(dburl, dbuser, dbpwd);
		System.out.println(conn);
		sqlString = "select id ,name ,address ,mail from pig_user_test";
		pstmt = conn.prepareStatement(sqlString);
		result = pstmt.executeQuery();

		while (result.next()) {
			objTablea = new ObjTablea();
			objTablea.setId(result.getInt(1));
			objTablea.setName(result.getString(2));
			objTablea.setAddress(result.getString(3));
			objTablea.setMail(result.getString(4));
			System.out.println(objTablea.getId() + objTablea.getName() + objTablea.getAddress() + objTablea.getMail() );
		}

		} catch (Exception e ) {
			System.err.println(e.getMessage());
		} finally {
			try {
				result.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
