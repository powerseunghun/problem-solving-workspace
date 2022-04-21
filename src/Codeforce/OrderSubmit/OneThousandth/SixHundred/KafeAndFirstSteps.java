package Codeforce.OrderSubmit.OneThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KafeAndFirstSteps {
	static int[] arr = null;
	static int[] check = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		check = new int[n];
		Arrays.fill(check, 1);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < check.length; i++) {
			if (arr[i] >= arr[i-1]) {
				check[i] = check[i-1]+1;
				max = Math.max(max, check[i]);
			}
		}
		
		System.out.println(max);
		br.close();
	}
}
