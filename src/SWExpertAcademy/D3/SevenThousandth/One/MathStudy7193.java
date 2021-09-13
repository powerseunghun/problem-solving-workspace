package SWExpertAcademy.D3.SevenThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathStudy7193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, X = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		int sum = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			sum = 0;
			N = Integer.parseInt(tmp.split(" ")[0]);
			X = tmp.split(" ")[1];
			for (int j = 0; j < X.length(); j++) {
				sum += (X.charAt(j)-'0');
			}
			sb.append("#" + i + " " + sum % (N-1) + "\n");
		}
		System.out.print(sb.toString());
	}
}
