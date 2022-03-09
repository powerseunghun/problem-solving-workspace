package Acmicpc.OrderSubmit.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

public class CreatePassword1837 {
	static int[] prime = new int[1000001];
	static Set<BigInteger> set = new TreeSet<>();
	static StringBuilder sb = new StringBuilder();
	static void primeInit() {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = i;
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) continue;
			set.add(new BigInteger(i+""));
			for (int j = 2 * i; j < prime.length; j+=i) {
				prime[j] = 0;
			}
		}
	}
	static void find(BigInteger P, BigInteger K) {
		BigInteger tmp = new BigInteger("0");
		for (BigInteger el : set) {
			if (el.compareTo(K) >= 0) break;
			if (P.mod(el).equals(tmp)) {
				sb.append("BAD " + el + "\n");
				return;
			}
		}
		sb.append("GOOD\n");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger P = new BigInteger(tmp.split(" ")[0]);
		BigInteger K = new BigInteger(tmp.split(" ")[1]);
		primeInit();
		find(P, K);
		
		System.out.print(sb.toString());
		br.close();
	}
}
