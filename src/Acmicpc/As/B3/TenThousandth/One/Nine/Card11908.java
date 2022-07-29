package Acmicpc.As.B3.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Card11908 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		System.out.println(sum-arr[N-1]);
		br.close();
	}
}
