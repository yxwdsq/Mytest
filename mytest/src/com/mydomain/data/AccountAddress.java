package com.mydomain.data;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class AccountAddress {

	private static SqlMapClient sqlmapper=null;

	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/mydomain/data/SqlMapConfigBack.xml");
			sqlmapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		}  catch (IOException e) {
			throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
		}
	}

	public static List selectAllAccountAddress() throws SQLException{
		return sqlmapper.queryForList("selectAllAccountAddress");
	}


}
