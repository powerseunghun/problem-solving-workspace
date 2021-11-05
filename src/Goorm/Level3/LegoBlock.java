package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LegoBlock {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int l = 1, leftMax = 0, r = 1, rightMax = 0;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		leftMax = arr[0];
		rightMax = arr[arr.length-1];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > leftMax) {
				l++;
				leftMax = arr[i];
			}
		}
		for (int i = arr.length-2; i >= 0; i--) {
			if (arr[i] > rightMax) {
				r++;
				rightMax = arr[i];
			}
		}
		
		System.out.println(l + " " + r);
		br.close();
	}
}
