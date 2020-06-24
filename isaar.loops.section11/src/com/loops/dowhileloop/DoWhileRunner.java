package com.loops.dowhileloop;

import java.util.Scanner;

public class DoWhileRunner {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int number=0;
		do { 
		System.out.println("enter a number:");
	number = scanner.nextInt()	;
	System.out.println("Cube is"+(number*number*number));
	}while (number>=0);
		
	}
}
