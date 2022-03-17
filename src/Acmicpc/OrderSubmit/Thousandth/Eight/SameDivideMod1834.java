package Acmicpc.OrderSubmit.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SameDivideMod1834 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());// num = 1, a = 0, b = 0;
		long sum = ((N-1) * (2 * (N+1) + ((N-2) * (N+1)))) / 2;
		System.out.println(sum);
//		do {
//			a = num / N;
//			b = num % N;
//			
//			if (a == b) sum += num;
//			num++;
//		} while(a < N);
		// length: N-1;
		// a1 = N+1;
		// d = N+1;
		// sum -> n{2 * a + (n-1) * d} / 2
		br.close();
	}
}
