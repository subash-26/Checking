package org.prat;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class mapUser {
	public static void main(String[] args) {
		Map<Integer, userDefined> mp = new LinkedHashMap<>();
		userDefined l = new userDefined();
		l.setresname("SS Hyderabad");
		l.setbranch("Vadapalani");
		
		userDefined l1 = new userDefined();
		l1.setresname("Salem RR");
		l1.setbranch("OMR");
		
		mp.put(0, l);
		mp.put(1, l1);
		Set<Entry<Integer, userDefined>> entrySet = mp.entrySet();
		for (Entry<Integer, userDefined> entry : entrySet)
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getresname());
			System.out.println(entry.getValue().getbranch());
		}
	}

}
