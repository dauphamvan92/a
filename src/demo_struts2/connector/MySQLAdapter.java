package demo_struts2.connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAdapter {

	protected static final String SQL_USER = "root";
	protected static final String SQL_PASSWORD = "0989276448";

	// Get connection to MySQL server with user/password: "root"/"admin"
	protected Connection conn = MySQLConnection.getSQLConnection("root", "0989276448");
	
	public ResultSet execSelect(String sql) throws SQLException {
		Statement sttm = conn.createStatement();
		return sttm.executeQuery(sql);
	}
}
