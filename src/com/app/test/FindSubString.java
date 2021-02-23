package com.app.test;

import java.util.Scanner;

public class FindSubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = "helloworld";
        int start = 3;
        int end = 8;
        System.out.println(S.substring(start,end));
        in.close();
    }
}
