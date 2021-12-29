package com.java_program.core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class User {
   String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
	
   

}

public class UserTest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no ");
		int no=sc.nextInt();
		
		//String name = null;
		String arr[]=new String[no];
		
		
		System.out.println("enter name ");
		
		for (int i = 0; i < no; i++) {
			
			arr[i]=sc.next();
			
			
		}
	
		
		  int fr[]=new int[arr.length];
	      int visited=-1;
	  
	  
		
		
       for (int i = 0; i < arr.length; i++) {
    	   int count=1;
    	   for (int j =i+1; j < arr.length; j++) {
   			
   		      	if (arr[i].equals(arr[j])) {
              				count++;
              				fr[j]=visited;
              				
              				
			       }
   		        
   		}
    	   if(fr[i]!=visited){
    	     fr[i]=count;
    	   }
		}
	
	
       //Displays the frequency of each element present in array  
       System.out.println("---------------------");  
       System.out.println(" Element | Frequency");  
       System.out.println("---------------------"); 
	  for (int i = 0; i < fr.length; i++) {
		if (fr[i]!=visited) {
			  System.out.println("" + arr[i] + "    |    " + fr[i]); 
		}
	}
	
	}

}
	

