package JDBCproject.ObjectTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utils.JdbcUtils;

public class ObjDML {


	public List<ObjTablea> select(String sqlString) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;

		ObjTablea obja = null;
		List<ObjTablea> listtablea = new ArrayList<ObjTablea>();

		try {
			conn = JdbcUtils.getconnect();
			pstmt = conn.prepareStatement(sqlString);
			result = pstmt.executeQuery();

			while (result.next()) {
				obja = new ObjTablea();
				obja.setId(result.getInt(1));
				obja.setName(result.getString(2));
				obja.setAddress(result.getString(3));
				obja.setMail(result.getString(4));
				listtablea.add(obja);
				System.out.println("ID:" + obja.getId() + ",NAME:" + obja.getName() +
						",ADDRESS:" + obja.getAddress() + ",MAIL:" + obja.getMail());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.release(conn, pstmt, result);
		}
		return listtablea;

	}

	public void insert(String sqlString) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;

		try {
			conn = JdbcUtils.getconnect();
			pstmt = conn.prepareStatement(sqlString);
			int m = pstmt.executeUpdate();
			if (m > 0) {
				System.out.println("success");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.release(conn, pstmt, result);
		}
	}

	public void update(String sqlString) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;

		try {
			conn = JdbcUtils.getconnect();
			pstmt = conn.prepareStatement(sqlString);
			int m = pstmt.executeUpdate();
			if (m > 0) {
				System.out.println("success");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.release(conn, pstmt, result);
		}
	}

	public void delete(String sqlString) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;

		try {
			conn = JdbcUtils.getconnect();
			pstmt = conn.prepareStatement(sqlString);
			int m = pstmt.executeUpdate();
			if (m > 0) {
				System.out.println("success");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.release(conn, pstmt, result);
		}
	}

	public static void ObjectBatch() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;

		try {
			conn = JdbcUtils.getconnect();
			String sql1 = "";
			String sql2 = "";
			String sql3 = "";
			stmt = conn.createStatement();

			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.executeBatch();
			stmt.clearBatch();;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.release(conn, null, result);
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
