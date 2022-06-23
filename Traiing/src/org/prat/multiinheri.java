package org.prat;

import org.mulinhe.mulindifpack;

public class multiinheri extends mulindifpack{
	
	public void child()
	{
		System.out.println("Child class in different package");
	}
	public static void main(String[] args) 
	{
		multiinheri ch = new multiinheri();
		ch.diffpack();
		ch.child();
			
	}
}
