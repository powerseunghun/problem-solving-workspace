package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectSqaure4571 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine());
		int sum = 0, min = 10001;
		int[] arr = new int[10001];
		boolean flag = false;
		
		for (int i = 1; i <= 100; i++) {
			arr[i*i] = 1;
		}
		
		for (int i = M; i <= N; i++) {
			if (arr[i] == 1) {
				flag = true;
				sum += i;
				min = min >= i ? i : min;
			}
		}
		if (!flag) {
			System.out.println("-1");
			return;
		}
		System.out.println(sum);
		System.out.println(min);
	}
}
