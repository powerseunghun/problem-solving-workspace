package Acmicpc.OrderSubmit.TenThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeOne12852 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int X = Integer.parseInt(br.readLine());
		int[] arr = new int[X+1], cnt = new int[X+1];
		
		Arrays.fill(arr, 0);
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + 1;
			cnt[i] = i-1;
			if (i % 2 == 0 && arr[i] > arr[i/2]+1) {
				arr[i] = arr[i/2]+1;
				cnt[i] = i/2;
			}
			if (i % 3 == 0 && arr[i] > arr[i/3]+1) {
				arr[i] = arr[i/3]+1;
				cnt[i] = i/3;
			}
		}
		sb.append(arr[X] + "\n");
		while (X != 0) {
			sb.append(X + " ");
			X = cnt[X];
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
