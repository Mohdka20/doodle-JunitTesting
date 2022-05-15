package com.cst8284.lab04;


import org.junit.Test;
import org.junit.Assert;

public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;
/*
 * Testing the recordPurchase,recievePayment & giveChange methods. test pass when expected and actual are equal
 */
   @Test 
   public void twoPurchases()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      register.receivePayment(2, 0, 5, 0, 0);
      double expected = 0.25;
      Assert.assertEquals(expected, register.giveChange(), EPSILON);
   }
   /*
    * Testing the giveChange methods. test pass when pass not null value
    */
   @Test
   public void newTestMethod() {
	      YourPurchases register = new YourPurchases();
	      Assert.assertNotNull(register);
	   
   }

   /*
    * Testing the recordPurchase,recievePayment & giveChange methods. test pass when expected and actual are not the same
    */
   @Test
   public void secondTestMethod() {
	      YourPurchases register = new YourPurchases();
	      register.recordPurchase(3.25);
	      register.receivePayment(4, 0, 0, 0, 0);
	      double expected = 0.75;
	      Assert.assertNotSame(expected, register.giveChange());
	   
   }
   
   }


