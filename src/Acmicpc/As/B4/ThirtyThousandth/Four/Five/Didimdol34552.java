package Acmicpc.As.B4.ThirtyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Didimdol34552 {
	static final int l = 11;
	static int[] arr = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine()), B = 0, S = 0, res = 0;
		double L = 0;
		String str = null;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while(N-- > 0) {
			str = br.readLine();
			B = Integer.parseInt(str.split(" ")[0]);
			L = Double.parseDouble(str.split(" ")[1]);
			S = Integer.parseInt(str.split(" ")[2]);
			
			if (L >= 2.0 && S >= 17) {
				res += arr[B];
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
