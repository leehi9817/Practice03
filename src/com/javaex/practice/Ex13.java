package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum = sum + i;
		}
		
		System.out.println("합계: " + sum);
		
		sc.close();

	}

}
