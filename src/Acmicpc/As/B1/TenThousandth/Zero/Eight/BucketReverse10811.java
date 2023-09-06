package Acmicpc.As.B1.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BucketReverse10811 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), s = 0, e = 0;
		arr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		while(M-- > 0) {
			str = br.readLine();
			s = Integer.parseInt(str.split(" ")[0]);
			e = Integer.parseInt(str.split(" ")[1]);
			
			for (int i = s, v = 0; i <= e; i++) {
				v = arr[i];
				arr[i] = arr[e];
				arr[e--] = v;
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			sb.append(arr[i]);
			if (arr[i] == arr[i-1]) continue;
			sb.append(" ");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
