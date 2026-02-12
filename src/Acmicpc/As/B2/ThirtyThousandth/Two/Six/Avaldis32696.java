package Acmicpc.As.B2.ThirtyThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avaldis32696 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		
		if (A != 0) {
			sb.append(A == 1 ? "x" : A == -1 ? "-x" : (A + "x"));
		}
		if (B != 0) {
			if (A != 0 && B > 0) {
				sb.append("+");
			}
			sb.append(B);
		} else if (A == 0) {
			sb.append("0");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
