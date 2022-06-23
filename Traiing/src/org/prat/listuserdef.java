package org.prat;

import java.util.List;
import java.util.ArrayList;


public class listuserdef {
	public static void main(String[] args)
	{
		List<userDefined> li=new ArrayList<userDefined>();
		userDefined l = new userDefined();
		l.setresname("SS Hyderabad");
		l.setbranch("Vadapalani");
		
		userDefined l1 = new userDefined();
		l1.setresname("Salem RR");
		l1.setbranch("OMR");
		
		li.add(l);
		li.add(l1);
		
		for(int i = 0; i<=li.size(); i++ )
		{
			System.out.println(li.get(i).getresname());
			System.out.println(li.get(i).getbranch());
		}
		
		
	}

}
