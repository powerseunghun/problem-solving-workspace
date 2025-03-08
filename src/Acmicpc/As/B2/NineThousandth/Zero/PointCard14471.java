package Acmicpc.As.B2.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PointCard14471 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, A = 0, B = 0;
		String str = null;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			
			double t = 0;
			double min = Double.MAX_VALUE;
			int res = 0;
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				A = Integer.parseInt(str.split(" ")[0]);
				B = Integer.parseInt(str.split(" ")[1]);
				t = (double) B/A;
				
				if (min > t) {
					min = t;
					res = (int)B;
				} else if (min == t && res > B) {
					res = B;
				}
			}
			sb.append(res).append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
