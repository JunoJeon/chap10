package com.example;


public class CustomExceptionExample {
	
	static class DividByZeroException extends Exception{
		
		public DividByZeroException() {
			
			
			
			
		}
		
		public DividByZeroException(String msg) {
			
			super(msg);
	
		}
		
	}

	public static void main(String[] args) {
		
		try {
			xxx();
		} catch (DividByZeroException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void xxx() throws DividByZeroException {
		throw new DividByZeroException("사용자 예외 발생");		//예외객체만 올 수 있음
		
	}

}
