package JDBCproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementTry {

	public static final String DBDRIVER = "";

	public static final String DBURL = "";

	public static final String DBUSER = "";

	public static final String PASSWORD = "";

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		Connection conn = null;
		PreparedStatement pstmt= null;
//		ResultSet result = null;

		String sql = "insert into table1(id) values (?) ";

		//1
		Class.forName(DBDRIVER);

		//2
		conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
		conn.setAutoCommit(false);

		//3
		pstmt = conn.prepareStatement(sql);

		for (int i = 0; i < 10; i++) {
			pstmt.setInt(1, i);
			pstmt.addBatch();
		}

		try {
		pstmt.executeBatch();

		conn.commit();

		} catch (Exception e)
		{conn.rollback();}
		finally {

		//4
		pstmt.close();
		conn.close();
		}

	}

}
