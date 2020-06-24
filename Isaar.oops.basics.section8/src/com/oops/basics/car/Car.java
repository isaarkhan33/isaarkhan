package com.oops.basics.car;

public class Car {
	// state
		private int speed; // member variable

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;

		}

		void start() {
			System.out.println("car started bruum");
		}

}
