package org.prat;

import java.util.LinkedHashSet;
import java.util.Set;

public class Seitera
{
	
	public static void main(String[ ] args)
	{
		Set<Integer> s = new LinkedHashSet<>();
		s.add(12);
		s.add(34);
		s.add(44);
		s.add(45);
		s.add(12);
		System.out.println(" Size of " + s);
		int size = s.size();
		System.out.println("size is " + size);
		for(Integer x : s )
		{
			System.out.println(x);
		}
		
	}


}
