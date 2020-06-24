package com.oops.encapsulation.book;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
			Book artOfJava = new Book();
			Book effectiveProgramming = new Book();
			Book cleanCode = new Book();

			artOfJava.setNoOfCopies(100);

			System.out.println(artOfJava.getNoOfCopies());

			effectiveProgramming.setNoOfCopies(50);

			System.out.println(effectiveProgramming.getNoOfCopies());

			cleanCode.setNoOfCopies(45);
			System.out.println(cleanCode.getNoOfCopies());
			
		}
	
		
}