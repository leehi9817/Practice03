package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while((i>=1)&&(i<=100)) {
			
			if((i%5==0)&&(i%7==0)) {
				System.out.println(i);
			}
			
			i++;
		}

	}

}
