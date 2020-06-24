package com.primitive.Char;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
	this.ch=ch;
	
	}

	public boolean  isVowel() {
		
		if (ch == 'a')
		return true;
		
		if (ch == 'e')
		return true;
		
		return false;
		
	}
	

}
