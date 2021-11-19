package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Placard {
	static int choice1 = 0, choice2 = 0;
	static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int s = 0, e = arr.length-1, val = 0;
		while (s < e) {
			val = Math.min(arr[s], arr[e]) * (e-s);
			if (val >= max) {
				choice1 = s+1;
				choice2 = e+1;
				max = val;
			}
			if (arr[s] <= arr[e]) s++;
			else e--;
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(getMax(arr));
		System.out.println(choice1 + " " + choice2);
		br.close();
	}
}
