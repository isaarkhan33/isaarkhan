package com.oops.interfaces;



		interface Flyable {
			void fly();
		}

		class Bird implements Flyable {

			@Override
			public void fly() {
				System.out.println("Birds with wings");
			}
		}
			class Aeroplane implements Flyable {

				@Override
				public void fly() {
					System.out.println("Aeroplane with fuel and pilot");
				}
			}

			class Rocket implements Flyable {

				@Override
				public void fly() {
					System.out.println("white petrol");

			}

		}



		public class FlyableRunner {

			public static void main(String[] args) {
				Flyable[] flyingObjects = { new Bird(), new Aeroplane(), new Rocket() };

				for (Flyable object : flyingObjects) {
					object.fly();
				}
			}
	}

