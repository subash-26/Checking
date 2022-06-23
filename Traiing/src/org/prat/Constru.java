package org.prat;



public class Constru 
{
	public Constru() {
		System.out.println("Default contructor");
	}
	public Constru(int empPhNo) {
		System.out.println("Parameterized constructor With emp mobile number " + empPhNo);
		}
	public Constru(String empName) {
		System.out.println("Parameterized construcotor With emp name " + empName);
		}
	public void empId(int id) {
		System.out.println("Emp id  : " + id);
	}
	public static void main(String[] args) {
		Constru d = new Constru();
		Constru d1 = new Constru("Subash");
		Constru d2 = new Constru(980980);
		d.empId(987676);
			}
	

}
