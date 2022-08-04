package Acmicpc.As.B3.TenThousandth.Eight.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheWalkingAdam {
	static int calc(String str) {
		return str.indexOf('D') == -1 ? str.length() : str.indexOf('D');
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			sb.append(calc(br.readLine()) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
