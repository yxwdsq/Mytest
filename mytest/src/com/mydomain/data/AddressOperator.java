package com.mydomain.data;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.mydomain.domain.Address;

public class AddressOperator {

	public static SqlMapClient sqlmapper;

	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/mydomain/data/SqlMapConfigBack.xml");
			sqlmapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
		}
	}

	public static void insertAddress(Address address) throws SQLException {
		sqlmapper.insert("insertAddress", address);
	}

	public static void updateAddress(Address address) throws SQLException {
		sqlmapper.update("updateAddress", address);
	}

	public static void deleteAddress(Address address) throws SQLException {
		sqlmapper.delete("deleteAddress", address);
	}

	public static List selectAddressByAccountId(int accountid) throws SQLException {
		return sqlmapper.queryForList("selectAddressByAccountId", accountid);
	}

}
