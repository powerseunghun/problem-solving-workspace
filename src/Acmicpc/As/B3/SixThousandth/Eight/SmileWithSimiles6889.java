package Acmicpc.As.B3.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmileWithSimiles6889 {
	static String[] adjs = null, nouns = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		adjs = new String[n];
		nouns = new String[m];
		
		for (int i = 0; i < n; i++) {
			adjs[i] = br.readLine();
		}
		for (int i = 0; i < m; i++) {
			nouns[i] = br.readLine();
		}
		
		for (String adj : adjs) {
			for (String nou : nouns) {
				sb.append(adj + " as " + nou + "\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
