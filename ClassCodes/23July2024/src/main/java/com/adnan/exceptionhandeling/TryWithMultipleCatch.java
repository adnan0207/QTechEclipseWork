package com.adnan.exceptionhandeling;

public class TryWithMultipleCatch {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			StackTraceElement[] stArr = e.getStackTrace();
			for (int i = 0; i < stArr.length; i++) {
				System.out.println("Frame " + (i+1) + " : " + stArr[i]);
			}
		}catch(Exception e) {
			StackTraceElement[] stArr = e.getStackTrace();
			for (int i = 0; i < stArr.length; i++) {
		        System.out.println("Frame " + (i+1) + " : " + stArr[i]);
		    }
		}
	}

}
