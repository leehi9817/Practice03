package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if (num%2==1) {
			for(int i=1; i<=num; i++) {
				if(i%2==1) {
					sum = sum + i;
				}
			}
		} else {
			for(int i=1; i<=num; i++) {
				if(i%2==0) {
					sum = sum + i;
				}
			}
		}
		
		System.out.println("결과값: " + sum);
		
		sc.close();

	}

}
