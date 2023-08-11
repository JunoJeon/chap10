package com.example;

public class AutoCloseExample {
	
	static class Alpha implements AutoCloseable{
		
		void show() throws Exception {
			System.out.println("Show");
			throw new Exception();
		}

		@Override
		public void close() throws Exception {
			System.out.println("Close");
		}
		
//		void close() throws Exception {
//			System.out.println("Close");
//			throw new Exception();
//		}
	}
	
	public static void main(String[] args) {
		try (Alpha a = new Alpha()) {
			a.show();
		} catch (Exception e) {
			System.out.println("exception 발생");
		}
		
		System.out.println("End");
	}
	
	
	public static void main2(String[] args) {
		
		Alpha a = new Alpha();
		
		try {
			a.show();
			
		} catch (Exception e) {
			
		} finally {
			try {
				a.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
