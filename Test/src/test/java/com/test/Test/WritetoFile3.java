package com.test.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WritetoFile3 {

	
	//private static final String FILENAME = "c:\\Users\\morsharm\\filename1.txt";

	public static void main(String[] args) {
		
		
		/*Buffered writers will only write out when they're full or when they're being closed (hence the name Buffered).

		So you can do this:

		out.close();
		which will flush the buffer and then close it. If you only wanted to flush it but keep it open for further writes (e.g. imagine you're writing a log file), you could do:

		out.flush();
		You'd likely want to do this when finishing up with such a resource. e.g. */
		
		String FILENAME = "C:\\Users\\morsharm\\sample5.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			String str1="testing is testing";
			 fw = new FileWriter(FILENAME);
			 bw  = new BufferedWriter(fw);
			
			bw.write(str1);
			System.out.println("Done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {

			try {

				if (bw != null)
					bw.close();

				//if (fw != null)
					//fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

	

	}
}

}