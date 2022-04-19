package Codeforce.OrderSubmit.OneThousandth.ThreeHundered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCapitalization {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		
		if (sb.toString().charAt(0) >= 'a' && sb.toString().charAt(0) <= 'z') {
			sb.setCharAt(0, (char)(sb.charAt(0)-32));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
