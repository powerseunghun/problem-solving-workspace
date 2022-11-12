package Acmicpc.As.B3.TwentyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathHomeWork24807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		int l = Integer.parseInt(tmp.split(" ")[3]);
		
		for (int i = 0; i*a <= l; i++) {
			for (int j = 0; j*b <= l; j++) {
				for (int k = 0; k*c <= l; k++) {
					if (i*a + j*b + k*c == l) {
						sb.append(i + " " + j + " " + k + "\n");
					}
				}
			}
		}
		
		System.out.print(sb.toString().equals("") ? "impossible" : sb.toString());
		br.close();
	}
}
