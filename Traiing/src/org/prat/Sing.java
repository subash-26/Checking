package org.prat;

public class Sing {
	public static Sing e;
	
	public static Sing getInstance() {
		if(e == null ) {
			e= new Sing();
			System.out.println(System.identityHashCode(e));
		}
		return e;
	}
	public void empid() {
		System.out.println("Emp Id");
	}
	public void empName() {
		System.out.println("EmpName");
	}
	public static void main(String[] args) {
		
		Sing e1 = getInstance();
		Sing e2 = getInstance();
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e1));
		e1.empid();
		e2.empName();
		e1.empName();
		e2.empid();
		}

}
