package CodeUp.Thousandth.Nine;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIOProcess1981 {
	public static void main(String[] args) throws IOException {
		File file = new File("secret.dic");
		FileReader fr = new FileReader(file);
		int c = 0;
		
		while((c = fr.read()) != -1) {
			System.out.print((char) c);
		}
		
		fr.close();
	}
}
