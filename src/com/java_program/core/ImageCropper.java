package com.java_program.core;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageCropper {

	public static void main(String[] args) {
	
	try {
		BufferedImage originalimage=ImageIO.read(new File("C:\\Users\\siddharth.baria\\Downloads\\car.jpg"));
      System.out.println("original image dimensional : "+ originalimage.getHeight()+ " x " + originalimage.getTileWidth());
	
      BufferedImage subimage=originalimage.getSubimage(56, 200, 200, 200);
      File outFile=new File("C:\\Users\\siddharth.baria\\Downloads\\car2.jpg");
      
      ImageIO.write(subimage,"jpg",outFile);
      
      System.out.println("Image cropped successfully: "+outFile.getPath());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
}
