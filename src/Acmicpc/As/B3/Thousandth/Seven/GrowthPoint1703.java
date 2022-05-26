package Acmicpc.As.B3.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GrowthPoint1703 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int a = 0, M = 0, tree = 0;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			if (a == 0) break;
			tree = 1;
			for (int i = 0; i < 2 * a; i++) {
				M = Integer.parseInt(st.nextToken());
				if (i % 2 == 0) tree *= M;
				else tree -= M;
			}
			sb.append(tree + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
