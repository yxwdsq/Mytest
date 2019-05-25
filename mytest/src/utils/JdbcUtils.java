package utils;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {

	private static String dbdriver = null;
	private static String dburl = null;
	private static String dbuser = null;
	private static String dbpwd = null;

	static {

		try {
			InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("mysql.properties");
			Properties prop = new Properties();
			prop.load(in);

			dbdriver = prop.getProperty("dbdriver");
			dburl = prop.getProperty("dburl");
			dbuser = prop.getProperty("dbuser");
			dbpwd = prop.getProperty("dbpwd");

			Class.forName(dbdriver);
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static Connection getconnect() throws Exception{
		Connection conn = null;
		try {
		conn = DriverManager.getConnection(dburl, dbuser, dbpwd);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
//		return DriverManager.getConnection(dburl, dbuser, dbpwd);
	}

	public static void release (Connection conn,PreparedStatement st,ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if (st != null) {
			try {
				st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



}
