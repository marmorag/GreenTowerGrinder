package jUnitFlo;

import junit.framework.*;

public class AllTests {

	public static Test suite() 
	{
		TestSuite suite = new TestSuite();
		suite.addTest(TestOthello.suite());

		return suite;
	}

//	public static void main(String[] args) {
//		junit.textui.TestRunner.run(suite());
//	}
}