package Acmicpc.Sorting.TenThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QIndex13333 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i = arr.length; i >= 0; i--) {
			cnt = 0;
			for (int j = 0; j < N; j++) {
				if (arr[j] >= i) cnt++;
			}
			if (cnt >= i) {
				System.out.println(i);
				return;
			}
		}
	}
}