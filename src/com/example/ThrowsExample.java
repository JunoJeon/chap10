package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ThrowsExample {

	public static void main(String[] args) throws SQLException {
		try {
			cursorMove(10, 20);
			cursorMove(-10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		connect();
	}
	
	static void cursorMove(int line, int column) throws Exception {
		if (line <= 0 || column <= 0) 
			throw new Exception("line, column은 1이상의 값이어야 합니다.");
		
		System.out.println("처리됨");
	}
	
	static void connect() throws SQLException {
		
		DriverManager.getConnection(null);
		
	}

}
