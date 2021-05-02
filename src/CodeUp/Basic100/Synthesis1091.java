package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1091 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long a = Integer.parseInt(tmp.split(" ")[0]);
		long m = Integer.parseInt(tmp.split(" ")[1]);
		long d = Integer.parseInt(tmp.split(" ")[2]);
		int n = Integer.parseInt(tmp.split(" ")[3]);
		for (int i = 1; i < n; i++) {
			a = (a * m) + d;
		}
		System.out.println(a);
	}
}
