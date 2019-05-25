package JDBCproject.ObjectTable;

import java.io.File;
import java.io.FileInputStream;

public class FileIO {

	static File logfile = null;

	public static void logFileRead(String filepath) {
		try {
			logfile = new File(filepath);
			if ( ! logfile.exists() ) {
				System.out.println(filepath + "not exists!");
			} else {
				FileInputStream filein = new FileInputStream(logfile);
				int m = filein.read(b);
				System.out.println(filein.toString());
				filein.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally {
//			filein.close();
//		}
	}

}
