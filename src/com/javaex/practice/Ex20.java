package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		int num = 29;
		int select;
		String start;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("   [숫자맞추기게임 시작]");
		System.out.println("======================");
		
		System.out.print(">>");
		select = sc.nextInt();
		
		while(true) {
			if(select==num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				sc.nextLine();
				start = sc.nextLine();
				if(start.equals("y")) {
					System.out.println("======================");
					System.out.println("   [숫자맞추기게임 종료]");
					System.out.println("======================");
					break;
				} else {
					System.out.print(">>");
					select = sc.nextInt();
				}
			} else if(select>num) {
				System.out.println("더 낮게");
				System.out.print(">>");
				select = sc.nextInt();
			} else if(select<num) {
				System.out.println("더 높게");
				System.out.print(">>");
				select = sc.nextInt();
			}
		}
		
		sc.close();

	}

}
