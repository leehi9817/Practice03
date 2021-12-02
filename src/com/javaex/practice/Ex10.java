package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		System.out.print("숫자: ");
		num1 = sc.nextInt();
		
		System.out.print("숫자: ");
		num2 = sc.nextInt();
		
		for(int i=3; i<=5; i++) {
			if (num1 > num2) {
				System.out.print("숫자: ");
				num2 = sc.nextInt();
			}
			else {
				System.out.print("숫자: ");
				num1 = sc.nextInt();
			}
		}
		
		if (num1 > num2) {
			System.out.println("최대값은 " + num1 + "입니다.");
		} else {
			System.out.println("최대값은 " + num2  + "입니다.");
		}
		
		sc.close();
	}

}
