package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PentagramNumber2723 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println((5 + ((n-1) * (14 + ((n-2) * 3))) / 2)%1000000004);
	}
}
