package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1090 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long a = Integer.parseInt(tmp.split(" ")[0]);
		long r = Integer.parseInt(tmp.split(" ")[1]);
		long n = Integer.parseInt(tmp.split(" ")[2]);
		
		r = (int) Math.pow(r, n - 1);
		
		System.out.println(a * r);
	}
}
