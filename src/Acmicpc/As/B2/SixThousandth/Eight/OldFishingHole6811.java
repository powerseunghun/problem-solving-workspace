package Acmicpc.As.B2.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OldFishingHole6811 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 0; a*i <= d; i++) {
			for (int j = 0; a*i+b*j <= d; j++) {
				for (int k = 0; a*i+b*j+c*k <= d; k++) {
					if (i == 0 && j == 0 && k == 0) continue;
					sb.append(i).append(" Brown Trout, ")
					.append(j).append(" Northern Pike, ")
					.append(k).append(" Yellow Pickerel").append("\n");
					res++;
				}
			}
		}
		sb.append("Number of ways to catch fish: ").append(res);
		System.out.println(sb.toString());
		br.close();
	}
}
