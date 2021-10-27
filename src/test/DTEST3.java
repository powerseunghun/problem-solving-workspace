package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DTEST3 {
	public int solution(int[] sticker) {
		int answer = 0;
		int[] arr = new int[sticker.length];
		
		if (sticker.length == 1) return sticker[0];
		else if (sticker.length == 2) return Math.max(sticker[0], sticker[1]);
		
		for (int i = 2; i < sticker.length; i++) {
			arr[i] = i < 2 ? sticker[i] : Math.max(arr[i-1], arr[i-2]+sticker[i]);
		}
		return arr[sticker.length];
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = {12, 80, 14, 22, 100};
	}
}
