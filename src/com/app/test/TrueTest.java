package com.app.test;

public class TrueTest {

	public static void main(String[] s) {
		System.out.println("something() Returns:"+something());
	}

	@SuppressWarnings("finally")
	public static boolean something() {
		
		while(true) {
			try {
				return true;
			}
			finally {
				break;
				}
			
		}
		
		return false;
	}

}
