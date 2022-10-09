package com.techfios.takeHome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

	static String path = "dictionaryFile.txt";

	public static void doesFileExists(String path) {
		File f = new File(path);
		

		try {
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			String line = "";
			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
				readLine(line);
			}
			fr.close();
			reader.close();
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("File doesn't exist");
		}

	}
	
	public static void readLine(String l) {
		
		String [] lineArray = l.split("-");
		String [] meaningArray = lineArray[1].split(",");
		Map m1 = new HashMap();
		List l1 = new ArrayList();
		
		l1.add(meaningArray[0]);
		l1.add(meaningArray[1]);
		
		m1.put(lineArray[0], l1);
		
		System.out.println(lineArray[0]);
		
		List printList = (List) m1.get(lineArray[0]);
		
			for (int i=0;i<printList.size();i++) {

			System.out.println(printList.get(i));
		}
		
	}

	public static void main(String[] args) {
		doesFileExists(path);
	}

}
