package Acmicpc.As.B3.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Piłeczka8719 {
	static int func(int x, int w) {
		int cnt = 0;
		while (x < w) {
			cnt++;
			x *= 2;
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), x = 0, w = 0;
		String tmp = null;
		
		while(t-- > 0) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			w = Integer.parseInt(tmp.split(" ")[1]);
			
			sb.append(func(x, w) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
