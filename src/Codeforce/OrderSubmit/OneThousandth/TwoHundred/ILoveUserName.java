package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ILoveUserName {
	static int[] arr = null, lis = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		lis = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr.length; i++) {
			lis[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					lis[i] = Math.max(lis[i], lis[j]+1);
					max = Math.max(lis[i], max);
				}
			}
		}
		for (int e : lis) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.println(max);
		br.close();
	}
}
