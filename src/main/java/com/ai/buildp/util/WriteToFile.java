package com.ai.buildp.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void  write(String st,String path){
		File f = new File(path);
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			output.write(st);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
