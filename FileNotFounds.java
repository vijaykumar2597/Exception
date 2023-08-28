package org.excpetion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class FileNotFounds {
	
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		try {
			
	
		File f=new File("C://Text/text.txt");
		
		FileReader fr=new FileReader(f);
		
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.println((char) temp);
		}
		
		
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Aschi value code 
		System.out.println('a'+'b');
	}

}
