package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckMessage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		File f= new File("D:\\Fil.txt");
		FileReader fr= new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}
		catch(FileNotFoundException io) {
			io.printStackTrace();
		}

	}

}
