package com.simplejunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.*;
public class junittestpractise {
	
 junitpractise j1=new junitpractise ();
 

	
 @Test
 public void testsort() {
	 int ar[]= {5,6,8,7,9};
	 int exp[]= {5,6,7,8,9};
	 int res[]=j1.javasort(ar);
	 assertArrayEquals(exp,res);
 }
 @Test

 public void iterableTest() {
 List<Integer> listone=new ArrayList<>(Arrays.asList(1,2,3,4));
 List<Integer> listtwo=new ArrayList<>(Arrays.asList(1,2,3,4));
 assertIterableEquals(listone,listtwo);
	
 }
 @Test
 public void checkdivide() {
	  assertThrows(ArrayIndexOutOfBoundsException.class,()->j1.divide(5,1));
 }
 
 
 
 
 
 
private void assertIterableEquals(List<Integer> listone, List<Integer> listtwo) {
	// TODO Auto-generated method stub
	
}
 
 
}
