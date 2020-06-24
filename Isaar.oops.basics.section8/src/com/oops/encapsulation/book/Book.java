package com.oops.encapsulation.book;

public class Book {
	public int getNoOfCopies() {
		return noOfCopies;
	}

	private int noOfCopies;

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies >0)
		this.noOfCopies = noOfCopies;
	}
	
	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies+ howMuch);
		}

	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies- howMuch);
		
		System.out.println("noOfCopies");
		
	}



}

