package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinValueReturn1536 {
	static int f(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = min <= arr[i] ? min : arr[i];
		}
		return min;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(f(arr));
	}
}
