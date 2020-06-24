package com.oops.basic1;

public class Rectangle {

	// state-fields
		private int length;
		private int width;

		public Rectangle(int length, int width) {
			super();
			this.length = length;
			this.width = width;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", width=" + width + ", getLength()=" + getLength() + ", getWidth()="
					+ getWidth() + "]";
		}

	
}
