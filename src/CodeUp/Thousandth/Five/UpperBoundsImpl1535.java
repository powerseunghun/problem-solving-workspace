package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpperBoundsImpl1535 {
	static int f(int[] arr) {
		int max = 0, idx = 0;
		for (int i = 0; i < arr.length; i++) {
			max = max >= arr[i] ? max : arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				idx = i;
				break;
			}
		}
		return idx+1;
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
