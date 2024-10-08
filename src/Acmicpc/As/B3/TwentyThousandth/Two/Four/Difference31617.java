package Acmicpc.As.B3.TwentyThousandth.Two.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Difference31617 {
	static void arrInit(int[] arr, StringTokenizer st) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(br.readLine()), res = 0;
		int[] arr1 = null, arr2 = null;
		
		arr1 = new int[N];
		arr2 = new int[M];
		
		arrInit(arr1, st);
		st = new StringTokenizer(br.readLine());
		arrInit(arr2, st);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				res = arr1[i]+K == arr2[j] ? res+1 : res;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
