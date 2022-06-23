package org.prat;


public class UserDefinedExcep {
	public static void main(String[] args) {
		int empId = 16;
		if(empId == 21) {
			System.out.println("SS Hyderabad");
			}else {try {
				
				throw new USDmsg();
				} catch (USDmsg e)
				{
						System.out.println("Exception catched");
						e.printStackTrace();
				}
	}
}

}
