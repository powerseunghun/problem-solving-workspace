package Codeforce.OrderSubmit.OneThousandth.EightHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HolidayOfEquality {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE, sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		
		for (int el : arr) {
			sum += Math.abs(max-el);
		}
		
		System.out.println(sum);
		br.close();
	}
}
