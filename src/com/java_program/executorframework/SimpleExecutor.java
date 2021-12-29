package com.java_program.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //creating an object of ExecutorService with fixed thread pool 5  
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		 
		//creating instance of the Task1 class and pass a value to its constructor   
	for (int i = 0; i < 5; i++) {
			 Runnable task=new Task1(""+i);
			executorService.execute(task);
      	}
		
	//closing Exutors
	executorService.shutdown();
	
	while (!executorService.isTerminated()) {
		
	}
		
    
	
	System.out.println("all system thread is finished.....");
	
	}

}
