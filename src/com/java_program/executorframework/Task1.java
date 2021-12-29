package com.java_program.executorframework;

public class Task1 implements Runnable {

	//varible of thread 
	private String thredno;
	
	
	
	//constructor for thread value
	public Task1(String thredno) {
		super();
		this.thredno = thredno;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName() + " " + thredno);
		
		
		processThread();
		//printing a statement to show the end of the thread  
		System.out.println(Thread.currentThread().getName() + " stop execution.... ");
		
		
	}
	
	
	 //creating processThread() method to execute thread  
	public void processThread() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}




	@Override
	public String toString() {
		return this.thredno;
	}

	
	
	
	
	
	
}
