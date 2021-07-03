package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountingNumber4562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int n = A*B*C;
		int[] counts = new int[10];
		Arrays.fill(counts, 0);
		
		while (n != 0) {
			counts[n % 10]++;
			n /= 10;
		}
		
		for (int el : counts) {
			System.out.println(el);
		}
	}
}
