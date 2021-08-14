package Acmicpc.BruteForceAlgorithm.FourThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One4375 {
	static String input = null;
	static int n = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = 0, count = 0;
		while ((input = br.readLine()) != null) {
			n = Integer.parseInt(input);
			num = 1;
			count = 1;
			while (true) {
				if (num % n == 0) {
					sb.append(count + "\n");
					break;
				}
				num = (num * 10 + 1) % n;
				count++;
			}
		}
		System.out.print(sb.toString());
	}
}
