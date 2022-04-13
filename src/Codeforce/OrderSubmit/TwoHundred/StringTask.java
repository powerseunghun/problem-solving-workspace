package Codeforce.OrderSubmit.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String vowels = "aoyeui", str = br.readLine().toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			if (!vowels.contains(str.charAt(i)+"")) {
				sb.append("." + str.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
