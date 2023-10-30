package Acmicpc.As.S5.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime1312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int N = Integer.parseInt(str.split(" ")[2]);
		int res = A%B;
		
		while(--N > 0) {
			res *= 10;
			res %= B;
		}
		
		System.out.println((res*10) / B);
		br.close();
	}
}
