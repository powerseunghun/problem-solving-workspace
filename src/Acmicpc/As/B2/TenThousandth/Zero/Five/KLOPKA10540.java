package Acmicpc.As.B2.TenThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KLOPKA10540 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = 0, y = 0;
		int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE, res1 = 0, res2 = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);
			max1 = Math.max(max1, x);
			min1 = Math.min(min1, x);
			max2 = Math.max(max2, y);
			min2 = Math.min(min2, x);
		}
		res1 = max1-min1;
		res2 = max2-min2;
		
		System.out.println(Math.max(res1, res2)*Math.max(res1, res2));
		br.close();
	}
}
