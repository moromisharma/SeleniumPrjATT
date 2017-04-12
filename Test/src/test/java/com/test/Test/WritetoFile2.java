package com.test.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WritetoFile2 {

	
	//private static final String FILENAME = "c:\\Users\\morsharm\\filename1.txt";

	public static void main(String[] args) {
		//Here we dont need to close  to write to a file  like it was in java 6 and below.
/*Buffered writers will only write out when they're full or when they're being closed (hence the name Buffered).

So you can do this:

out.close();
which will flush the buffer and then close it. If you only wanted to flush it but keep it open for further writes (e.g. imagine you're writing a log file), you could do:

out.flush();
You'd likely want to do this when finishing up with such a resource. e.g. */
		
		
		try (BufferedWriter out = new BufferedWriter(
		        new FileWriter("C:\\Users\\MORSHARM\\Desktop\\name.txt"))) {
		    out.write("hELLO WORLD");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	}