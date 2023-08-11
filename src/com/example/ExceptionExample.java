package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	
	public static void main(String[] args) {
		String url = "";
		String user = "scott";
		String password = "tiger";
		
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End");
	}
	
	public static void main3(String[] args) {
		
		System.out.println("Start");
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">>");
		try {
			
			int num = scan.nextInt();
			System.out.println("num = " + num);

		} catch (InputMismatchException e) {
			
			System.out.println("입력하신 값은 수치가 아닙니다");
			System.out.println("수치값은 [0~9] 입니다.");
			
		} 
		System.out.println("End");
	}

	
	

	public static void main2(String[] args) {
		
		System.out.println("Start");
		
		
		System.out.println(100/0);
		
		
		System.out.println("End");
	}

}
