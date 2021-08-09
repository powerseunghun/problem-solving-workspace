package Acmicpc.BruteForceAlgorithm.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeAndPalindrome1747 {
	static int[] prime = new int[1003002];
	static boolean[] palindrome = new boolean[1003002];
	static void primeInit() {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = i;
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) continue;
			for (int j = 2 * i; j < prime.length; j+=i) {
				prime[j] = 0;
			}
		}
	}
	static boolean check(int n) {
		String str = n + "";
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	static void palindromeInit() {
		for (int i = 1; i < palindrome.length; i++) {
			if (check(i)) {
				palindrome[i] = true;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		primeInit();
		palindromeInit();
		while (true) {
			if (prime[N] != 0 && palindrome[N]) {
				System.out.println(N);
				return;
			}
			else N++;
		}
	}
}
