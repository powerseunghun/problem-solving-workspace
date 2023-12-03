package Acmicpc.As.S5.ThreeThousandth.Zero;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class GreedyPig3060 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, s = 0, res = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			s = 0;
			while(st.hasMoreTokens()) {
				s += Integer.parseInt(st.nextToken());
			}
			
			res = 1;
			while (s <= N) {
				s *= 4;
				res++;
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
