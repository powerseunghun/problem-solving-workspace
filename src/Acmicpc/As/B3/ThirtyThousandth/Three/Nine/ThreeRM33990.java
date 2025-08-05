package Acmicpc.As.B3.ThirtyThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeRM33990 {
	static final int RM = 512;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0, gap = Integer.MAX_VALUE, res = -1;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			sum = 0;
			sum += Integer.parseInt(str.split(" ")[0]);
			sum += Integer.parseInt(str.split(" ")[1]);
			sum += Integer.parseInt(str.split(" ")[2]);
			if (sum < RM) continue;
			
			if (Math.abs(RM-sum) <= gap) {
				res = sum;
				gap = Math.abs(RM-sum);
			}
		}
		System.out.println(res);
		br.close();
	}
}
