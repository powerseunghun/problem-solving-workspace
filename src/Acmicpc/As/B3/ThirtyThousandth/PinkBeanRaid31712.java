package Acmicpc.As.B3.ThirtyThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinkBeanRaid31712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cu = Integer.parseInt(str.split(" ")[0]);
		int du = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int cd = Integer.parseInt(str.split(" ")[0]);
		int dd = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int cp = Integer.parseInt(str.split(" ")[0]);
		int dp = Integer.parseInt(str.split(" ")[1]);
		int h = Integer.parseInt(br.readLine()), res = 0;
		
		while(h > 0) {
			if (res % cu == 0) h -= du;
			if (res % cd == 0) h -= dd;
			if (res % cp == 0) h -= dp;
			if (h > 0) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
