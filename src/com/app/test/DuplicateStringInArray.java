package com.app.test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringInArray {

	public static void main(String[] args) {

		String a[]= {"ah","bh","ch","ah"};

		Set<String> s1=new HashSet<>();
		Set<String> s2=new HashSet<>();

		for(String sarr : a) { 

			boolean b= s1.add(sarr);

			if(b==false) {

				s2.add(sarr);

			}

		}
		System.out.print(s2);
	}

}
