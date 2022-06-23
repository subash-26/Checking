package org.prat;

public class Interclas implements difcla {

	@Override
	public void restaruntname() {
		System.out.println("Restarunt Name SS Hyderbad");
	}

	@Override
	public void restaruntbranch() {
		System.out.println("Nungbakkam");
	}
	
	public static void main(String[] args)
	{
		Interclas jk=new Interclas();
		jk.restaruntname();
		jk.restaruntbranch();
	}
}
