package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpStairsCondition4564 {
	static int[] arr = null;
	static int[] mem = null;
	static int get(int n) {
		if (n <= 0) return 0;
		if (n <= 2) {
			mem[n] = n == 1 ? arr[1] : arr[1] + arr[2];
			return mem[n];
		}
		if (mem[n] != 0) return mem[n];
		else {
			mem[n] = (Math.max(get(n-3)+arr[n-1], get(n-2))) + arr[n];
			return mem[n];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		mem = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		}
		System.out.println(get(n));
	}
}
