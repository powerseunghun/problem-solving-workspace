package Acmicpc.As.B3.TwentyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeExercise20299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int T = Integer.parseInt(tmp.split(" ")[0]);
		int L = Integer.parseInt(tmp.split(" ")[1]);
		int X = Integer.parseInt(tmp.split(" ")[2]), sum = 0, cnt = 0;
		boolean flag = true;
		
		while (T-- > 0) {
			tmp = br.readLine();
			sum = 0;
			flag = true;
			for (int i = 0, val = 0; i < tmp.split(" ").length; i++) {
				val = Integer.parseInt(tmp.split(" ")[i]);
				if (val < X) {
					flag = false;
					break;
				}
				sum += val;
			}
			if (sum < L) flag = false;
			if (flag) {
				sb.append(tmp + " ");
				cnt++;
			}
		}
		
		System.out.println(cnt);
		System.out.println(sb.toString());
		br.close();
	}
}
