package org.prat;

public class Singleinhechd extends Singleinhepa
	{
	   public void Child()
	   {
	     System.out.println("Child class ");
	   }
	   public static void main(String args[])
	   {
		   Singleinhechd obj = new Singleinhechd();
	     obj.Parent(); 
	     obj.Child(); 
	  }
	
}


