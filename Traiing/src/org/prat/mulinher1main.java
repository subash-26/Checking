package org.prat;

public class mulinher1main implements mulinher2, mulinher1 {

	@Override
	public void restaruntname() {
		System.out.println("SS Hyderabad");
	}

	@Override
	public void restaruntdetails() {
		System.out.println("3 star hotel");
	}

	@Override
	public void restaruntlocation() {
		System.out.println("Nungbakkam");
	}

	@Override
	public void famousdish() {
		System.out.println("Grill,Briyani");
	}

	@Override
	public void noofbranches() {
		System.out.println("More than 173 branches");
	}
	
	public static void main(String[] args) {
		
		mulinher1main lm=new mulinher1main();
	 lm.restaruntname();
	 lm.restaruntdetails();
	 lm.restaruntlocation();
	 lm.famousdish();
	 lm.noofbranches();
	

	}
	

}
