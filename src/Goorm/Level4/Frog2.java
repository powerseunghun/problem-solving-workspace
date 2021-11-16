package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Frog2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = arr.length-1, diff = 0; i > 0; i--) {
			diff = arr[i]-arr[i-1];
			res = Math.max(diff, res);
			res++;
		}
//		if (Math.max(arr[0], res) == arr[0]) res++;
		
		System.out.println(res);
		br.close();
	}
}
