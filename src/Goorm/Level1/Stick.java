package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stick {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), rightMax = 0, count = 1;
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		rightMax = arr[arr.length-1];
		
		for (int i = arr.length-2; i >= 0; i--) {
			if (arr[i] > rightMax) {
				rightMax = arr[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
