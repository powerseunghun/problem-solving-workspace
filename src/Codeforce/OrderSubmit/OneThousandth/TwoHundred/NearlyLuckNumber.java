package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NearlyLuckNumber {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '4' || str.charAt(i) == '7') count++;
		}
		System.out.println(count == 4 || count == 7 ? "YES" : "NO");
		br.close();
	}
}
