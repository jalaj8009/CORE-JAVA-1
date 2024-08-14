package com.rays.java.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineText {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D://Hello.txt");
		
		BufferedReader br = new BufferedReader(reader);
		
		String str = br.readLine();

		while (str != null) {

			System.out.println(str);

			str = br.readLine();

		}
		reader.close();
		br.close();

	}


 }
 

