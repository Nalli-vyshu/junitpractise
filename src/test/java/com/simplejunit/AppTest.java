package com.simplejunit;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

@Test
public void testadd() {
	App a1 =new App();
	int exp = 5;
	int res = a1.add(2,  3);
	assertEquals(exp,res);

}

@Test
public void testsub() {
	App a1 = new App();
	int exp = 2;
    int res = a1.sub(5, 3);
	assertEquals(exp,res);
}

@Test
   public void testmul() {
	App a1 = new App();
	int exp = 6;
	int res = a1.mul(2, 3);
	assertEquals(exp,res);
	
}
@Test
  public void testdiv() {
	App a1 = new App();
	int exp = 3;
	int res = a1.div(9, 3);
	assertEquals(exp,res);
	
}
}


