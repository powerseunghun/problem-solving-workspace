package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1085 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long h = Integer.parseInt(tmp.split(" ")[0]);
		long b = Integer.parseInt(tmp.split(" ")[1]);
		long c = Integer.parseInt(tmp.split(" ")[2]);
		long s = Integer.parseInt(tmp.split(" ")[3]);
		
		double sum = h * b * c * s;
	
		System.out.printf("%.1f MB", sum / 8 / 1024 / 1024);
	}
}
