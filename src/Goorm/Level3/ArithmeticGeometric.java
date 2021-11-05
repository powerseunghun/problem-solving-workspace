package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArithmeticGeometric {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		int a = 0, d = 0;
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 1) {
				d = arr[i]-arr[i-1];
				a = arr[i] / arr[i-1];
			}
			else if (i > 1) {
				if (d != arr[i]-arr[i-1]) flag = true;
			}
		}
		
		System.out.println(!flag ? arr[arr.length-1] + d : arr[arr.length-1] * a);
	}
}
