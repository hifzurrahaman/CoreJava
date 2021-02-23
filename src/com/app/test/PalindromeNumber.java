package com.app.test;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		int number=12281;
		int temp=number;
		int rev=0,rem;
		
		while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		}
		if(rev==number)
		System.out.print("Number  "+rev+" is palindrome");
		else System.out.print("Number is not "+rev+" is palindrome");
	}

}
