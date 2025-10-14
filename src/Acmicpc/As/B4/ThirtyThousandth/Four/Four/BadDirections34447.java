package Acmicpc.As.B4.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BadDirections34447 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		String str = null;
		
		while(t-- > 0) {
			str = br.readLine();
			int k = Integer.parseInt(str.split(" ")[0]);
			str = str.split(" ")[1];
			for (int i = 0; i < str.length(); i++) {
				sb.append((str.charAt(i)-'0'+k)%10);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
