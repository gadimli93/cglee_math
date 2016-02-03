package org.math.ockwon.test;

import org.math.ockwon.MathProject;

import java.awt.Rectangle;

import org.junit.Test;
import junit.framework.TestCase;

public class MathProjectTest extends TestCase{
	MathProject mp = null;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		mp = new MathProject();
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		mp = null;
		super.tearDown();
	}
	
	@Test
	public void testIsValidRand_CHECK_RESULT() {
		if(mp == null)
			TestCase.fail("Rand object is not initialized.");
		
		// Rand Test
		int i = mp.rand(1, 10);
		TestCase.assertEquals(i<11, true);
		TestCase.assertEquals(i>0, true);
		System.out.println(i);

		System.out.println("Successful...");
	
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



