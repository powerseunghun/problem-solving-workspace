package Acmicpc.As.B3.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RichardHamming13456 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), res = 0;
		StringTokenizer st1 = null, st2 = null;
		
		while(T-- > 0) {
			br.readLine();
			st1 = new StringTokenizer(br.readLine());
			st2 = new StringTokenizer(br.readLine());
			
			res = 0;
			while(st1.hasMoreTokens() && st2.hasMoreTokens()) {
				res = Integer.parseInt(st1.nextToken()) != Integer.parseInt(st2.nextToken()) ? res+1 : res;
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
