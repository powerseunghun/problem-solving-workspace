package Acmicpc.As.B3.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dorayaki33164 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), res = 0;
		arr1 = new int[N];
		arr2 = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				res += (arr1[i]+arr2[j]) * Math.max(arr1[i], arr2[j]);
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
