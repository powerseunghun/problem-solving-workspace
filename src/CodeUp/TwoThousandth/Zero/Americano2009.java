package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Americano2009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int coffee = 0;
		int k = Integer.parseInt(tmp.split(" ")[0]);
		int n = Integer.parseInt(tmp.split(" ")[1]);
		
		while(k >= n) {
			coffee += k / n;
			k = (k % n) + (k / n);
		}
		System.out.println(coffee);
	}
}
