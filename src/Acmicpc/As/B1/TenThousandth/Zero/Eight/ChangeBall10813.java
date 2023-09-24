package Acmicpc.As.B1.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeBall10813 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), a = 0, b = 0, swap = 0;
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		while(M-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			swap = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = swap;
		}
		
		for (int el : arr) {
			sb.append(el).append(" ");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
