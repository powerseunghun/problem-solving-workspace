package Acmicpc.OrderSubmit.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardReverseArrangeMent10804 {
	static int[] arr = new int[21];
	static void init() {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	static void func(int s, int e) {
		int[] tmp = new int[e-s+1];
		int idx = 0;
		for (int i = e; i >= s; i--) {
			tmp[idx++] = arr[i];
		}
		for (int el : tmp) {
			arr[s++] = el;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		init();
		for (int i = 0, s = 0, e = 0; i < 10; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			e = Integer.parseInt(tmp.split(" ")[1]);
			func(s, e);
		}
		
		for (int i = 1; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
