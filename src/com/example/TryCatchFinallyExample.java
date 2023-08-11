package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryCatchFinallyExample {
	
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@host:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			stmt.executeQuery("select * from xxx");
			
			Thread.sleep(100);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End");
	}
	
	
	

	public static void main2(String[] args) {
		try {
			
			System.out.println(100 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("항상 실행");
		}
		System.out.println("End");
	}

}
