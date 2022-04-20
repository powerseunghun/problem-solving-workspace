package Codeforce.OrderSubmit.OneThousandth.EightHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hulk {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			sb.append("I ");
			
			if (i%2 == 0) sb.append("hate ");
			else sb.append("love ");
			if (i == n-1) sb.append("it ");
			else sb.append("that ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
