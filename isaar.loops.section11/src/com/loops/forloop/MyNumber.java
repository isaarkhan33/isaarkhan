package com.loops.forloop;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number =number;
		
	}

	public boolean isPrime() {
		for (int i=2; i <=number-1; i++);
				
		if (number % 2 == 0) {
			return false;
		}
		
		return true;
	}

}
