package Acmicpc.As.B3.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AngryChangYoung3034 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int W = Integer.parseInt(tmp.split(" ")[1]);
		int H = Integer.parseInt(tmp.split(" ")[2]);
		int D = (int)Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
		
		for (int i = 0, val = 0; i < N; i++) {
			val = Integer.parseInt(br.readLine());
			if (val > Math.max(W, Math.max(H, D))) {
				sb.append("NE\n");
			}
			else sb.append("DA\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
