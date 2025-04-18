package Acmicpc.As.B2.TenThousandth.Two.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CentauriPrime12518 {
	static int check(String str) {
		char c = str.charAt(str.length()-1);
		if (c == 'y' || c == 'Y') {
			return 1;
		} else if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' 
				|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			return 2;
		} else return 3;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		for (int i = 1; i <= N; i++) {
			str = br.readLine();
			sb.append("Case #").append(i).append(": " + str).append(" is ruled by ");
			switch (check(str)) {
			case 1:
				sb.append("nobody");
				break;
			case 2:
				sb.append("a queen");
				break;
			case 3:
				sb.append("a king");
				break;
			}
			sb.append(".\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}