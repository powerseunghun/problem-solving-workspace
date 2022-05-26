package Acmicpc.As.B3.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class GoodPassword2061 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger K = new BigInteger(tmp.split(" ")[0]);
		int L = Integer.parseInt(tmp.split(" ")[1]);
		
		arr = new int[L+1];
		Arrays.fill(arr, 0);
		arr[1] = 1;
		
		for (int i = 2; i < L; i++) {
			if (arr[i] != 0) continue;
			if (K.remainder(new BigInteger(i+"")) == BigInteger.ZERO) {
				System.out.println("BAD " + i);
				br.close();
				return;
			}
			for (int j=i*2; j <= L; j+=i) {
				arr[j] = 1;
			}
		}
		System.out.println("GOOD");
		br.close();
	}
}
