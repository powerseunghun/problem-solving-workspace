package Acmicpc.As.B4.TwentyThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheFastestSortingAlgorithmInTheWorld23235 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		for (int i = 1; ; i++) {
			st = new StringTokenizer(br.readLine());
			if (Integer.parseInt(st.nextToken()) == 0) break;
			sb.append("Case " + i + ": Sorting... done!\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
