package ex08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:testdb";
			String uid = "green";
			String upw = "1234";
			
			conn = DriverManager.getConnection(url, uid, upw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
			
}
