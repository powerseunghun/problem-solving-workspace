package Acmicpc.As.B4.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gift28281 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.split(" ")[0]);
		int X = Integer.parseInt(str.split(" ")[1]);
		long res = Long.MAX_VALUE, v = 0;
		
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) { 
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			v = (arr[i] + arr[i+1]) * X;
			res = Math.min(v, res);
		}
		
		System.out.println(res);
		br.close();
	}
}
