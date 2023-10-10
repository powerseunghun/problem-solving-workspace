package Acmicpc.As.B1.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SendMeTheMoney15786 {
	static boolean func(String origin, String str, int N) {
		int res = 0;
		for (int i = 0, t = 0; i < str.length(); i++) {
			if (origin.charAt(t) == str.charAt(i)) {
				res++;
				t++;
				if (res == N) return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine(), origin = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		
		while(M-- > 0) {
			str = br.readLine();
			sb.append(func(origin, str, N) ? "true" : "false").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
