package Acmicpc.OrderSubmit.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineUp2631 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		int[] arr = new int[N], lis = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < arr.length; i++) {
			lis[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[j]+1 > lis[i]) {
					lis[i] = lis[j]+1;
					max = Math.max(max, lis[i]);
				}
			}
		}
		
		System.out.println(N-max);
		br.close();
	}
}
