package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		int n;
		int f = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			f = f * i;
		}
		
		System.out.println("결과값: " + f);
		
		sc.close();

	}

}
