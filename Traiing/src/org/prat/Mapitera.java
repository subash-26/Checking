package org.prat;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapitera {

	public static void main(String[]  args)
	{
		Map<String, String> mp=new LinkedHashMap<>();
		mp.put("Name", "Raja");
		mp.put("Email","Raja12@gmail.com");
		mp.put("Coourse " , " Selenium " );
		mp.put("Address" ,  "OMR" );
		System.out.println("Iterate Only the Entries");
		System.out.println(mp);
		System.out.println("Iterate the Key and Values");
		Set<Entry<String, String>> entrySet = mp.entrySet();
		for (Entry<String, String> entry : entrySet){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("Iterate the Keys");
		Set<String> keyset = mp.keySet();
		System.out.println("Keyset are " + keyset );
		System.out.println("Iterate the values");
		Collection<String> values = mp.values();
		System.out.println("Values are " + values );
		
		boolean containnkey = mp.containsKey("Email");
		System.out.println(containnkey);
		boolean containValue = mp.containsValue("OMR");
		System.out.println(containValue);
	}

}
