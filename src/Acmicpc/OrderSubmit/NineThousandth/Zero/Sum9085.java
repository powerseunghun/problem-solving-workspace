package Acmicpc.OrderSubmit.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum9085 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), sum = 0;
		
		for (int i = 0; i < T; i++, sum = 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
