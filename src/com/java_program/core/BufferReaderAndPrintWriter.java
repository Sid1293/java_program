package com.java_program.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferReaderAndPrintWriter {

	public static void main(String[] args) {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("E:\\siddharth_eclipse\\file1.txt"));
	         PrintWriter pr=new PrintWriter(new FileWriter("E:\\siddharth_eclipse\\file2.txt"));
		   
	         int cout=0;
	         String str;
	         while ((str=br.readLine())!=null) {
				
	        	 cout++;
	        	 pr.println(cout+"."+str);	
	        	 System.out.println(cout + ". " + str);
	        	 
	        	 Thread.sleep(500);
	        	 
	         }
	         
	         
	         pr.close();
	         br.close();
	         
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	  	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
