package JDBCproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementQuery {

	public static final String DBDRIVER = "";

	public static final String DBURL = "";

	public static final String DBUSER = "";

	public static final String PASSWORD = "";

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		String sql = "select id from table1 where id = 1";

		//1
		Class.forName(DBDRIVER);

		//2
		conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);

		//3
		pstmt = conn.prepareStatement(sql);
		result = pstmt.executeQuery();
		while (result.next()) {
			System.out.println(result.getInt(1));
		}

		//4
		result.close();
		pstmt.close();
		conn.close();

	}

}
