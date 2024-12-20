package Acmicpc.As.B3.ThirtyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HurricaneWarning30266 {
	static boolean check(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), N = 0, res = 0;
		String str = null;
		
		for (int idx = 1; idx <= K; idx++) {
			N = Integer.parseInt(br.readLine());
			str = br.readLine();
			res = 0;
			for (int i = 0; i < N; i++){
				res += check(str, br.readLine()) ? 1 : 0;
			}
			sb.append("Data Set ").append(idx).append(":\n");
			sb.append(res).append("\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
