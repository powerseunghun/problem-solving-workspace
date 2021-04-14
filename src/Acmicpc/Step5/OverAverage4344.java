package Acmicpc.Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverAverage4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()), N = 0, sum = 0, count = 0;
		StringTokenizer st = null;
		String tmp = null;
		
		for (int i = 0; i < C; i++) {
			tmp = br.readLine();
			st = new StringTokenizer(tmp);
			N = Integer.parseInt(st.nextToken());
			sum = 0;
			count = 0;
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(tmp);
			st.nextToken();
			while (st.hasMoreTokens()) {
				if (Integer.parseInt(st.nextToken()) > ((double)sum / N)) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", ((double)count / N) * 100);
		}
	}
}
