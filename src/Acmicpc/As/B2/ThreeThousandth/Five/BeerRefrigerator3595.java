package Acmicpc.As.B2.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeerRefrigerator3595 {
	static int[] arr = new int[3];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long tmp = 0L, min = Long.MAX_VALUE;
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if (i * j > N) break;
				for (int k = 1; k <= j; k++) {
					if (i*j*k > N) break;
					if (i*j*k == N) {
						tmp = (i*j+j*k+k*i) * 2;
						if (min > tmp) {
							arr[0] = i;
							arr[1] = j;
							arr[2] = k;
							min = tmp;
						}
					}
				}
			}
		}
		
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		br.close();
	}
}
