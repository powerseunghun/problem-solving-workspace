package Acmicpc.As.B3.TwentyThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Shooting27960 {
	static int[] arr = new int[10];
	static int[] cnts = new int[10];
	static void init() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.pow(2, i);
		}
	}
	static void func(int N) {
		int sum = 0;
		for (int i = arr.length-1; sum != N; i--) {
			if (sum + arr[i] <= N) {
				sum += arr[i];
				cnts[i]++;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int sum = 0;
		
		init();
		func(A);
		func(B);
		
		for (int i = 0; i < cnts.length; i++) {
			sum += cnts[i] == 1 ? arr[i] : 0;
		}
		
		System.out.println(sum);
		br.close();
	}
}
