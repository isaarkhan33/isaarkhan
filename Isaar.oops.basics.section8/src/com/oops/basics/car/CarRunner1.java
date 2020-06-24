package com.oops.basics.car;

public class CarRunner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car gmc = new Car();

		Car chev = new Car();

		gmc.start();
		chev.start();
		{

		}
		gmc.setSpeed(100);
		System.out.println(gmc.getSpeed());

		chev.setSpeed(100);
		System.out.println(chev.getSpeed());

	}
	

}
