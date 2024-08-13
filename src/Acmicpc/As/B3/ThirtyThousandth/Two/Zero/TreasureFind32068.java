package Acmicpc.As.B3.ThirtyThousandth.Two.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreasureFind32068 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int T = Integer.parseInt(br.readLine());
		long l = 0, r = 0, s = 0;
		
		while(T-- > 0) {
			str = br.readLine();
			l = Long.parseLong(str.split(" ")[0]);
			r = Long.parseLong(str.split(" ")[1]);
			s = Long.parseLong(str.split(" ")[2]);
			l -= s; r -= s; s = 0;
			
			sb.append(Math.min(r, l*-1)*2 + (r > (l*-1) ? 1 : 0)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
