package org.prat;

import org.mulinhe.overrid;

public class Methodoverlod extends overrid {
	
	public void restarunt()
	{
		System.out.println("Restarunt name is SALEM RR");
	}
	public void resbranch()
	{
		System.out.println("OMR Branch");
	}
	public static void main(String[] args) 
	{
		Methodoverlod ik=new Methodoverlod();
		overrid ij = new overrid();
		ik.restarunt();
		ik.resbranch();
		ij.restarunt();
		ij.resbranch();
	}

}
