package org.prat;

public class Construthis 
{
	public Construthis() {
		this("Raja");
		System.out.println("Default contructor");
	}
	public Construthis(int empPhNo) {
		System.out.println("Parameterized constructor With emp mobile number " + empPhNo);
		}
	public Construthis(String empName) {
		this(1245);
		System.out.println("Parameterized construcotor With emp name " + empName);
		}
	
	public static void main(String[] args) {
		Construthis d = new Construthis();
		}
}
