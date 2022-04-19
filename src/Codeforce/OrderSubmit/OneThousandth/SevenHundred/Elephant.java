package Codeforce.OrderSubmit.OneThousandth.SevenHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elephant {
	static int[] arr = null;
	static int[] mem = null;
	static int get(int N) {
		if (N == 0) return 0;
		if (N <= 5) {
			return mem[N] = arr[N] = 1;
		}
		if (mem[N] != 0) return mem[N];
		
		else {
			int min1 = Math.min(get(N-5), get(N-4));
			int min2 = Math.min(get(N-3), get(N-2));
			return mem[N] = arr[N] = Math.min(Math.min(min1, min2), get(N-1)) + 1;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		mem = new int[N+1];
		if (N <= 5) {
			System.out.println("1");
			return;
		}
		
		System.out.println(get(N));
		br.close();
	}
}
