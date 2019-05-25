package JDBCproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class StatementQuery {

	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";

	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521.orcl";

	public static final String DBUSER ="";

	public static final String PASSWORD = "";

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;

		//1.
		Class.forName(DBDRIVER);

		//2.
		conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);

		//3.
		stmt = conn.createStatement();

		//
		String sql = "select * from ";
		result=stmt.executeQuery(sql);
		while (result.next()) {
			int id = result.getInt("id");
			Date udate = result.getDate("udate");

			System.out.println("id = " + id );
			System.out.println("udate = " + udate );
		}

		//4.
		result.close();
		stmt.close();
		conn.close();

	}

}
