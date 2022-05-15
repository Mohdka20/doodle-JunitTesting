package com.cst8284.lab04Test;

import org.junit.Test;

import com.cst8284.lab04.YourPurchases;

import org.junit.Assert;

/**
 * @author Mohamed Elsheikh
 *
 */
public class YourPurchasesTest2 {
 /*
  * Testing the recordPurchase,recievePayment & giveChange methods. test pass when expected and actual are not the same
 */
	  @Test 
	   public void testPurchase()
	   {
	      YourPurchases p = new YourPurchases();
	    
	      p.recordPurchase(1.50);
	      p.receivePayment(0, 0, 15, 0, 0);
	      double expected = 0.0;
	      Assert.assertNotSame(expected,p.giveChange() );
	   }
	

}
