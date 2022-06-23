package org.mulinhe;



public class vari {
     static int m=100;//static variable 
   
       
    public void method()  
    {    
        int n=90;//local variable  
        System.out.println(m);
        System.out.println(n);
    }  
    
    public static void main(String args[])  
    {  
       int data=50;//instance variable 
       System.out.println(data);
       System.out.println(m);
       vari.method();
       System.out.println(n);
       
    }  
    


}
