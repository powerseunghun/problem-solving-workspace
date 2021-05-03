package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IterationPrint1254 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		char s = tmp.split(" ")[0].charAt(0);
		char e = tmp.split(" ")[1].charAt(0);
		
		for (int i = s; i <= e; i++) {
			System.out.print((char)i + " ");
		}
	}
}
