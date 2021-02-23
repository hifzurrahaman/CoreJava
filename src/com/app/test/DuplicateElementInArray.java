package com.app.test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		int a[]= {3,5,2,6,9,6,9,8,5,6,4,7,2,2,7,3,5,5,5};

		Set<Integer> s=new HashSet<>();
		Set<Integer> s2=new HashSet<>();

		for(int num : a) { 

			boolean b= s.add(num);

			if(b==false) {

				s2.add(num);

			}


		}
		System.out.print(s2);
	}

}
