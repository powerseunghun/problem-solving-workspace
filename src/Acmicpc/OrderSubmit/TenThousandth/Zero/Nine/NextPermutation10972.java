package Acmicpc.OrderSubmit.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextPermutation10972 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), idx = 0, tmp1 = 0, tmp2 = 0;
		boolean flag = false;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = arr.length-1; i > 0; i--) {
			if (arr[i-1] < arr[i]) {
				flag = true;
				idx = i;
				break;
			}
		}
		if (!flag) {
			System.out.println("-1");
			return;
		}
		for (int i = arr.length-1, c = arr.length-1; i >= idx; i--) {
			if (arr[idx-1] < arr[i]) {
				tmp1 = arr[idx-1];
				arr[idx-1] = arr[i];
				arr[i] = tmp1;
				while (idx < c) {
					tmp2 = arr[idx];
					arr[idx++] = arr[c];
					arr[c--] = tmp2;
				}
				i = idx-1;
			}
		}
		
		for (int el : arr) sb.append(el + " ");
		System.out.println(sb.toString());
		br.close();
	}
}
