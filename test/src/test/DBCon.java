package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String url ="jdbc:mariadb://192.168.0.48:3306/oreo";
	private static final String id = "root";
	private static final String pwd = "12345678";
	private static final String driver = "org.mariadb.jdbc.Driver";
	private static Connection con;
	
	private static void open() {
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, id, pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getCon() {
		if(DBCon.con!=null) {
			open();
		}
		return DBCon.con;
	}
	
	
	
	public static void close() {
		if(DBCon.con!=null) {
			try {
				DBCon.con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		DBCon.con = null;
	}
	
	
	
	public static void main(String[]args) {
		DBCon.getCon();
	}
}
