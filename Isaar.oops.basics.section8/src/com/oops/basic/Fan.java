package com.oops.basic;

public class Fan {
	// state
		private String make;
		private double radius;
		private String colour;
		// upper three state or fields are mandatory just assume
		private boolean isOn;
		private byte speed; // 1 to 5

		public Fan(String make, double radius, String colour) {
			this.make=make;
			this.radius=radius;
			this.colour=colour;
		}
			//isOn
		public void isOn(boolean isOn) {
			   this.isOn= isOn;
			   
	}

	@Override
	public String toString() {
		return "Fan [make=" + make + ", radius=" + radius + ", colour=" + colour + ", isOn=" + isOn + ", speed=" + speed
				+ "]";
	}
}
