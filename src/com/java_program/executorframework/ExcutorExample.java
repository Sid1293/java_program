package com.java_program.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorExample {
 public static void main(String[] args) {
	
	 ExecutorService executorService=Executors.newFixedThreadPool(10);
	 executorService.execute(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Execuroservice");
		}
	});
	 
	 executorService.shutdown();
	 
	 System.out.println("after shutdown .....");
}
}
