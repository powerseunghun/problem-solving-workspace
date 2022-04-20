package Codeforce.OrderSubmit.OneThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdds {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine(); 
		long n = Long.parseLong(tmp.split(" ")[0]);
		long k = Long.parseLong(tmp.split(" ")[1]);
		
		if (k <= (n+1)/2) {
			System.out.println(((k-1) * 2) + 1);
		}
		else {
			System.out.println(2 * (k - ((n+1)/2)));
		}
	}
}
