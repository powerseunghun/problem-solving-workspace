package Acmicpc.As.B3.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoJinJu31009 {
	static final String target = "jinju";
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), w = 0, b = 0, idx = 0, res = 0;
		String str = null, c = null;
		arr = new int[N];
		
		while(N-- > 0) {
			str = br.readLine();
			c = str.split(" ")[0];
			w = Integer.parseInt(str.split(" ")[1]);
			arr[idx++] = w;
			if (c.equals(target)) {
				b = w;
			}
		}
		for (int el : arr) {
			if (el > b) res++;
		}
		
		System.out.println(b);
		System.out.println(res);
		br.close();
	}
}
