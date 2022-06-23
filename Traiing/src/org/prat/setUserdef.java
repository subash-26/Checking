package org.prat;

import java.util.LinkedHashSet;
import java.util.Set;

public class setUserdef {
	public static void main(String[] args)
	{
		Set<userDefined> s = new LinkedHashSet<>();
		userDefined l = new userDefined();
		l.setresname("SS Hyderabad");
		l.setbranch("Vadapalani");
		
		userDefined l1 = new userDefined();
		l1.setresname("Salem RR");
		l1.setbranch("OMR");
				
		s.add(l);
		s.add(l1);
		
		for( userDefined x:s)
		{
			System.out.println(x.getresname());
			System.out.println(x.getbranch());
		}

}
}
