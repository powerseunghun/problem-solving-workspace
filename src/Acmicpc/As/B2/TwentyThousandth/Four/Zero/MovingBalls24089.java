package Acmicpc.As.B2.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MovingBalls24089 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), a = 0, b = 0;
		
		arr = new int[N+1];
		for (int i = 1 ; i < arr.length; i++) {
			arr[i] = i;
		}
		
		while (M-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			arr[a] = b;
		}
		
		for (int i = 1; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
