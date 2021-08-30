package SWExpertAcademy.D1.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShareAndRemainder2029 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0;
		int s = 0, rem = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			s = a / b;
			rem = a % b;
			sb.append("#" + i + " " + s + " " + rem + "\n");
		}
		System.out.print(sb.toString());
	}
}
