package org.math.ockwon;

import java.util.Random;

public class MathProject {
	public MathProject() {
		System.out.println("Math Project");
	}
	
	public int rand(int min, int max) {
		Random r = new Random();
		int i = r.nextInt(max-min);
		return i + min;
	}
	
	public class MathRectangle extends java.langs.Object {
		public double height;
		public double width;

		public MathRectangle(double width, double height) {
		    this.width = width;
		    this.height = height;
		}

	    public double getArea() {
	        return width * height;
	    }
	}

}

