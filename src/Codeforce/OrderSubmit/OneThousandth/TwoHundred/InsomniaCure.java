package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsomniaCure {
	static int[] arr = null;
	static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int l = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		arr = new int[d+1];
		
		for (int i = 1; i < arr.length; i++) {
			if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) arr[i] = 1;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 1) count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
