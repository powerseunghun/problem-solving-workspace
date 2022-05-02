package Acmicpc.As.B4.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISBN6810 {
	static String str = "9780921418";
	static int[] arr = new int[3];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, w = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < str.length(); i++) {
			sum += ((str.charAt(i)-'0') * w);
			w = w == 1 ? 3 : 1;
		}
		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] * w);
			w = w == 1 ? 3 : 1;
		}
		
		System.out.println("The 1-3-sum is " + sum);
		br.close();
	}
}
