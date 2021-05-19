package CodeUp.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Factorization2203 {
	static void getList(ArrayList<Long> list, long n) {
		for (long i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == Math.sqrt(n)) {
					list.add(i);
				}
				else {
					list.add(i);
					list.add(n/i);
				}
			}
		}
	}
	static boolean isPrime(long n) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == Math.sqrt(n)) count++;
				else count += 2;
			}
		}
		return count == 2;
	}
	static long getMaxPrime(ArrayList<Long> list) {
		long max = 0;
		for (long i = 0; i < list.size(); i++) {
			if (isPrime(list.get((int)i))) {
				if (list.get((int)i) >= max) {
					max = list.get((int)i);
				}
			}
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Long> list = new ArrayList<>();
		long n = Long.parseLong(br.readLine());
		getList(list, n);
		
		System.out.println(getMaxPrime(list));
	}
}
