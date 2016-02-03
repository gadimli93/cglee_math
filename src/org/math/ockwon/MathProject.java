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
}
