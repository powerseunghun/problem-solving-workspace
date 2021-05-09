package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LowerBoundReturnFunction1570 {
	static int f(int[] arr, int t) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= t) return i+1;
		}
		return arr.length+1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(f(arr, Integer.parseInt(br.readLine())));
	}
}
