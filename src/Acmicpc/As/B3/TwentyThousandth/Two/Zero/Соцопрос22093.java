package Acmicpc.As.B3.TwentyThousandth.Two.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Соцопрос22093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0, a = 0, b = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			a = Integer.parseInt(tmp.split(" ")[1]);
			b = Integer.parseInt(tmp.split(" ")[2]);
			sb.append((a-b < 0 ? 0 : a-b) + " " + Math.min(a, n-b) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
