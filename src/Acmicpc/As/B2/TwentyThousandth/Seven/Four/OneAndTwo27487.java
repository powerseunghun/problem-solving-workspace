package Acmicpc.As.B2.TwentyThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OneAndTwo27487 {
	static int[] arr = null;
	static final int TWO = 2;
	static int func(int tc) {
		int cnt = 0;
		if ((tc & 1) != 0) return -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == TWO) cnt++;
			if (cnt == tc/TWO) return i+1;
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int t = Integer.parseInt(br.readLine()), n = 0, tc = 0;
		StringTokenizer st = null;
		
		while(t-- > 0) {
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			arr = new int[n];
			tc = 0;
			for (int i = 0, v = 0; i < arr.length; i++) {
				v = Integer.parseInt(st.nextToken());
				arr[i] = v;
				if (v == TWO) tc++;
			}
			sb.append(func(tc)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
