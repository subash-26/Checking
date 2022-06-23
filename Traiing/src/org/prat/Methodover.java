package org.prat;

public class Methodover {
	
	public void restarunt(String restaruntname)
	{
		System.out.println("Restarunt name is " + restaruntname );
	}
	public void restarunt(int starhotel)
	{
		System.out.println("It's a "+ starhotel +" starhotel restarunt");
	}
	public void restarunt(float sharevalue)
	{
		System.out.println(" Share value of the restaunt is " + sharevalue);
	}
	public void restarunt(String restaruntname, int starhotel,float sharevalue )
	{
		System.out.println("Restarunt name is " + restaruntname +  "It's a "+ starhotel +" starhotel restarunt" + " Share value of the restaunt is " + sharevalue );
	}
	
	public static void main(String[] args) {
		Methodover che = new  Methodover();
		che.restarunt("Blue Moon" );
		che.restarunt(5);
		che.restarunt(3748.7f);
		che.restarunt("Blue Moon" , 5 , 3748.7f);
	}
}
 