package Acmicpc.GreedyAlgorithm.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OthelloReArrangement13413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		String str1 = null;
		String str2 = null;
		int btow = 0, wtob = 0;
		for (int t = 0; t < T; t++) {
			N = Integer.parseInt(br.readLine());
			str1 = br.readLine();
			str2 = br.readLine();
			btow = 0;
			wtob = 0;
			for (int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) == 'B' && str2.charAt(i) == 'W') btow++;
				else if (str1.charAt(i) == 'W' && str2.charAt(i) == 'B') wtob++;
			}
			sb.append(Math.max(btow, wtob) + "\n");
		}
		System.out.print(sb.toString());
	}
}
