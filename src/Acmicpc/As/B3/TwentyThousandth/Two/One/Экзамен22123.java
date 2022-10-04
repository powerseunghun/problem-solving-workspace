package Acmicpc.As.B3.TwentyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Экзамен22123 {
	static int getTime(String str) {
		String[] ts = str.split(":");
		int sum = 0, w = 1;
		for (int i = ts.length-1; i >= 0; i--) {
			sum += (Integer.parseInt(ts[i]) * w);
			w *= 60;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), st = 0, et = 0, k = 0, gap = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			st = getTime(tmp.split(" ")[0]);
			et = getTime(tmp.split(" ")[1]);
			if (et <= st) {
				et += 86400;
			}
			gap = et-st;
			
			k = Integer.parseInt(tmp.split(" ")[2]) * 60;
			if (gap >= k) {
				sb.append("Perfect");
			}
			else if (st+k > et+3600) {
				sb.append("Fail");
			}
			else sb.append("Test");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
