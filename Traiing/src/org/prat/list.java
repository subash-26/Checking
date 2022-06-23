package org.prat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class list {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(23);
		a.add(34);
		a.add(12);
		a.add(17);
		a.add(19);
		
		List<Integer> b=new ArrayList<Integer>();
		b.add(48);
		b.add(56);
		b.add(12);
		b.add(34);
		b.add(91);
		
	    a.addAll(b);
		
		Collections.sort(a);
		
		System.out.println(a);
		
		
		
		
	}

	

}

