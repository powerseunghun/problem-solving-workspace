package bird;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class upstair {
	static int[] arr = null;
	static int[] mem = null;
	static int func(int n) {
		if (n <= 0) return 0;
		else if (n <= 2) {
			return mem[n] = n==1 ? arr[n] : arr[n-1]+arr[n];
		}
		
		if (mem[n] != 0) return mem[n];
		// important
		else return mem[n] = Math.max(func(n-3)+arr[n-1], func(n-2)) + arr[n];
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		mem = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(func(N));
		br.close();
	}
}
