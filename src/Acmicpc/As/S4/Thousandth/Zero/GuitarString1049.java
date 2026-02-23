package Acmicpc.As.S4.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuitarString1049 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int s = Integer.MAX_VALUE, o = Integer.MAX_VALUE, res = 0;
		arr1 = new int[M]; 
		arr2 = new int[M];
		
		for (int i = 0; i < M; i++) {
			str = br.readLine();
			arr1[i] = Integer.parseInt(str.split(" ")[0]);
			arr2[i] = Integer.parseInt(str.split(" ")[1]);
			s = Math.min(s, arr1[i]);
			o = Math.min(o, arr2[i]);
		}
		
		if (o * 6 <= s) {
			res = o*N;
		} else {
			res = s*(N/6);
			N %= 6;
			if (o*N <= s) {
				res += o*N;
			} else {
				res += s;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
