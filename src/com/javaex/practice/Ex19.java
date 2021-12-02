package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		int select, money;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			select = sc.nextInt();
			
			switch(select) {
				case 1:
					System.out.print("예금액>");
					money = sc.nextInt();
					sum = sum + money;
					System.out.println("");
					break;
				case 2:
					System.out.print("출금액>");
					money = sc.nextInt();
					sum = sum - money;
					System.out.println("");
					break;
				case 3:
					System.out.println("잔고액>" + sum);
					System.out.println("");
					break;
				case 4: System.out.println("프로그램 종료");
					break;
				default: 
					System.out.println("다시 입력해주세요");
					System.out.println("");
					break;
 			}
			
		} while(select!=4);
		
		sc.close();
		
	}

}
