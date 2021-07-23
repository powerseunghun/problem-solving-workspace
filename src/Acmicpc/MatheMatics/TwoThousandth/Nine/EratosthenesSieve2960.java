package Acmicpc.MatheMatics.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EratosthenesSieve2960 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), count = 0;
		
		int[] arr = new int[N+1];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			arr[i] = 0;
			count++;
			if (count == K) System.out.println(i);
			for (int j = i * 2; j < arr.length; j += i) {
				if (arr[j] == 0) continue;
				arr[j] = 0;
				count++;
				if (count == K) System.out.println(j);
			}
		}
	}
}
