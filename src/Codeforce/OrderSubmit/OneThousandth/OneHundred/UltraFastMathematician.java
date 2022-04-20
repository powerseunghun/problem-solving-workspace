package Codeforce.OrderSubmit.OneThousandth.OneHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UltraFastMathematician {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str1 = br.readLine(), str2 = br.readLine();
		
		for (int i = 0; i < str1.length(); i++) {
			sb.append(str1.charAt(i) ^ str2.charAt(i));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
