package com.Practice.java;

       class Haaaa {

	 
	        int i;
	        public void display() 
	        {
	            System.out.println(i);
	        }    
	    }    
	    class B extends Haaaa 
	   {
	        int j;
	        public void display() 
	        {
	            System.out.println(j);
	        } 
	        
	    
	        public static void main(String args[])
	        {
	            B obj2 = new B();
	            obj2.i = 1;
	            obj2.j = 2;
	            Haaaa r;
	            r = obj2;
	            r.display();     
	        }
	   
	}

	    
	    
