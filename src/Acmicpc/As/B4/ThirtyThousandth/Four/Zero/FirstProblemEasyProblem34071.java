package Acmicpc.As.B4.ThirtyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstProblemEasyProblem34071 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0;
		arr =  new int[N];
		for (int i = 0, val = 0; i < arr.length; i++) {
			val = Integer.parseInt(br.readLine());
			arr[i] = val;
		}
		int res1 = Integer.MIN_VALUE, res2 = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			res1 = Math.max(res1, arr[i]);
			res2 = Math.min(res2, arr[i]);
		}
		System.out.println(arr[0] == res2 ? "ez" : arr[0] == res1 ? "hard" : "?");
		br.close();
	}
}
