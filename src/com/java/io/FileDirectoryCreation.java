package com.java.io;

import java.io.File;
import java.io.IOException;

public class FileDirectoryCreation {

	public static void main(String[] args) throws IOException {
		fileCheck();
		directoryCheck();
	}

	private static void directoryCheck() {
		File directory = new File("E:/dir1"); //this will never create a new directory, if directory exist then that directory will be pointed by this File object(directory)
		directory.mkdir(); //actually this line will create the directory.	
	}

	private static void fileCheck() throws IOException {
		File file = new File("E:/newFile.pdf"); //this will never create a new file, if file exist then that file will be pointed by this File object(file)
		file.createNewFile(); //actually this line will create the file.
	}
}
