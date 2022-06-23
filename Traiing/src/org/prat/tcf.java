package org.prat;

public class tcf {
	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println("1");
			System.out.println("2");
			System.out.println(3/0);
			System.out.println("4");
		}catch (Exception e) {
			System.out.println("Exception Catched" + e);
		}finally
		{
			System.out.println("End");
		}

	}

}
