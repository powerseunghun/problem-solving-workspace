package Acmicpc.Tree.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SangKeunTravle9372 {
	// Minimal Spanning Tree Theory
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		for (int i = 0, n = 0, m = 0; i < T; i++) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			sb.append((n-1) + "\n");
			for (int j = 0; j < m; j++) {
				br.readLine();
			}
		}
		System.out.print(sb.toString());
	}
}
