package Acmicpc.As.B3.NineThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpaceTravel9501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, D = 0;
		int cnt = 0, v = 0, f = 0, c = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			D = Integer.parseInt(tmp.split(" ")[1]);
			cnt = 0;
			for (int i = 0; i < N; i++) {
				tmp = br.readLine();
				v = Integer.parseInt(tmp.split(" ")[0]);
				f = Integer.parseInt(tmp.split(" ")[1]);
				c = Integer.parseInt(tmp.split(" ")[2]);
				
				cnt = (D <= v*f/c) ? cnt+1 : cnt;
			}
			sb.append(cnt + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
