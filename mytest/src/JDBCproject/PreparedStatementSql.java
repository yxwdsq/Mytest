package JDBCproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementSql {

	public static final String DBDRIVER = "";

	public static final String DBURL = "";

	public static final String DBUSER = "";

	public static final String PASSWORD = "";

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		Connection conn = null;
		PreparedStatement pstmt = null;
		int id = 0;

		String sql = "insert into table1(id) values( ? ) ";

		//1
		Class.forName(DBDRIVER);

		//2
		conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);

		//3
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();

		//4
		pstmt.close();
		conn.close();


	}

}
