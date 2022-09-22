package Acmicpc.As.B4.TwentyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Förvirradföreläsare21280 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), tmp = 0, cur = 0, val = 0;
		int res1 = 0, res2 = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (cur != 0) {
				res1 += val < cur ? cur-val : 0;
				res2 += val > cur ? val-cur : 0;
			}
			cur = val;
		}
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
