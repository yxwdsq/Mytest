package com.install.model;

import java.io.File;
import java.io.FileOutputStream;

public class WriteFile {

	public static void writeFile(String filePath,String contents) {
		File log = null;

		try {
			log = new File(filePath);
			if (! log.exists()) {
				log.createNewFile();
				log = new File(filePath);
			}

			FileOutputStream fileout = new FileOutputStream(log,true);
			fileout.write(contents.getBytes());
			fileout.flush();
			fileout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
