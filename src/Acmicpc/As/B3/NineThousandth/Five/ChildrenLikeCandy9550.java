package Acmicpc.As.B3.NineThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChildrenLikeCandy9550 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), K = 0, val = 0, sum = 0;
		StringTokenizer st = null;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			K = Integer.parseInt(tmp.split(" ")[1]);
			st = new StringTokenizer(br.readLine());
			sum = 0;
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				sum += val / K;
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
