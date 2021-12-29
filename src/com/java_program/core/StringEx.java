package com.java_program.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file=new File("E:\\siddharth_eclipse\\paragraf.txt");
        try {
			FileInputStream fileInputStream=new FileInputStream(file);
			InputStreamReader reader=new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader=new BufferedReader(reader);
	            
			String line=null;
			    int wordcount=0;
			    int characterCount = 0;
		        int paraCount = 0;
		        int whiteSpaceCount = 0;
		        int sentenceCount = 0;
			
			while ((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
				if (line.equals("")) {
				   paraCount=paraCount+1;
				}else {
					
					
				}
				
			}
        
        
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
