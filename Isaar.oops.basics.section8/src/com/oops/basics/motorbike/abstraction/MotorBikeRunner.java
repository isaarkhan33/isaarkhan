package com.oops.basics.motorbike.abstraction;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotorBike yamaha = new MotorBike();
		MotorBike honda = new MotorBike();
		MotorBike suzuki = new MotorBike();
		MotorBike hero = new MotorBike();

		yamaha.start();
		honda.start();

		yamaha.start1();
		honda.start1();

		suzuki.start2();
		hero.start2();

		yamaha.setSpeed(120);
		yamaha.increaseSpeed(100);
		yamaha.decreaseSpeed(5);
		
		
		System.out.println(yamaha.getSpeed());

		honda.setSpeed(100);
		System.out.println(honda.getSpeed());

		suzuki.setSpeed(200);
		System.out.println(suzuki.getSpeed());

	}

		
	}


