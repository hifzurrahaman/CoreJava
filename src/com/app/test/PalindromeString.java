package com.app.test;

public class PalindromeString {

	public static void main(String[] args) {
		String str="allah";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			//System.out.println(rev);
		}
		if(str.equals(rev))
			System.out.println("String:  "+str+"  is palindrome");
		else
			System.out.println("String:  "+str+"  is not palindrome");

	}

}
