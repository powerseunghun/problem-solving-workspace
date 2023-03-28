package Acmicpc.As.B3.TwentyThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Choice26645 {
	static final int s = 200;
	static final int limit[] = {209, 219, 229, 300};
	static final int item[] = {8, 4, 2, 1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE, maxIdx = 0;
		
		for (int i = 0, tn = N, cnt = 0; i < limit.length; i++, cnt = 0, tn = N) {
			for (int j = 0; j < item[i]; j++) {
				if (tn >= s && tn <= limit[i]) {
					cnt++;
					tn++;
				}
			}
			if (cnt >= max) {
				max = cnt;
				maxIdx = i+1;
			}
		}
		
		System.out.println(maxIdx);
		br.close();
	}
}
