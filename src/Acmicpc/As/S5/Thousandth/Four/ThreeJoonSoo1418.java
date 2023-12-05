package Acmicpc.As.S5.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeJoonSoo1418 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine()), res = 0;
		arr = new int[N+1];
		
//		for (int i = 2; i < arr.length; i++) {
//			arr[i] = i;
//		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 0) continue;
			for (int j = i; j < arr.length; j+=i) {
				arr[j] = Math.max(arr[j], i);
			}
		}
		for (int i = 1; i < arr.length; i++) {
			res = arr[i] <= K ? res + 1 : res;
		}
		System.out.println(res);
		br.close();
	}
}
