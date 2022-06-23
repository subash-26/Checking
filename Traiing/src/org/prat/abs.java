package org.prat;

public class abs extends Abstr {
	
	@Override
	public void resName() {
		System.out.println(" Restarunt name is SS Hyderabad");
	}

	@Override
	public void resBranch() {
		System.out.println(" Vadapalani Branch");
	}
	public void content()
	{
		System.out.println("It's famous for Briyani");
	}
	public static void main(String[] args) {
		
		abs i=new abs();
		i.resName();
		i.resBranch();
		i.content();
		i.location();
		
	}

}
