package Acmicpc.As.B3.TwentyThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NotASumB23530 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String tmp = null;
		
		while(t-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			if (a+b == 50) {
				sb.append(49 + "\n");
			}
			else sb.append(50 + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
