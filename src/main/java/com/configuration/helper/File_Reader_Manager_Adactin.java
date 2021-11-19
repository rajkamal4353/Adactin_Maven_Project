package com.configuration.helper;

public class File_Reader_Manager_Adactin {
	
	private File_Reader_Manager_Adactin() {
		
	}

	public static File_Reader_Manager_Adactin getInstanceFRM() {
		
		// create a object for File Reader Manager
		
		File_Reader_Manager_Adactin frm = new File_Reader_Manager_Adactin();
		
		return frm;
	}
	
	public Configuration_Reader_Adactin getInstanceCR() throws Throwable{
		
		// create a object for Configuration Reader
		
		Configuration_Reader_Adactin reader = new Configuration_Reader_Adactin();
		
		return reader;
	}
}
