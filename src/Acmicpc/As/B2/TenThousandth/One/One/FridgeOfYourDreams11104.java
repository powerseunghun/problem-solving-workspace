package Acmicpc.As.B2.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FridgeOfYourDreams11104 {
	static int func(String str) {
		StringBuilder sb = new StringBuilder(str);
		String rStr = sb.reverse().toString();
		int res = 0;
		for (int i = 0; i < rStr.length(); i++) {
			res += (rStr.charAt(i)-'0') * Math.pow(2, i);
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			sb.append(func(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
