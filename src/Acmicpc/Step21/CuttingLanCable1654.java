package Acmicpc.Step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuttingLanCable1654 {
	static boolean check(long cut, int[] arr, int M) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt += (arr[i] / cut);
		}
		if (cnt >= M) return true;
		else return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		long left = 1, right = 0, cut = 0, ans = 0;
		
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			right = Math.max(right, arr[i]);
		}
		
		while (left <= right) {
			cut = (left+right)/2;
			if (check(cut, arr, M)) {
				ans = cut;
				left = cut+1;
			}
			else right = cut-1;
		}
		
		System.out.println(ans);
	}
}
