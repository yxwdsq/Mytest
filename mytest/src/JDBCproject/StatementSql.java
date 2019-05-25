package JDBCproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementSql {

	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";

	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521.orcl";

	public static final String DBUSER = "";

	public static final String PASSWORD = "";

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		Connection conn = null;
		Statement stmt = null;

		//1.load dbdriver
		Class.forName(DBDRIVER);

		//2 connection
		conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);

		//3. statement use connection instance
		stmt = conn.createStatement();

		String sql = "insert into ct.customer ";
		stmt.executeUpdate(sql);

		//4. close dbconnection
		stmt.close();
		conn.close();


	}

}
