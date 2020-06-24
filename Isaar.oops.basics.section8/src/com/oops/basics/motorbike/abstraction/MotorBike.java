package com.oops.basics.motorbike.abstraction;

public class MotorBike {

	// STATE
		private int speed; // membervariable
		// BEHAVIOUR
		// method
		// input int speed
		// output void
		// name setspeed


		void start() {
			System.out.println("motor started");
		}

		void start1() {
			System.out.println("motor started twice");
		}

		void start2() {
			System.out.println("what the fish");
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		public void increaseSpeed(int howMuch) {
			setSpeed(this.speed+howMuch);
		}
		
		public void decreaseSpeed(int howMuch) {
			setSpeed(this.speed -howMuch);
			
		}
}
