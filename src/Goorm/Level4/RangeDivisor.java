package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RangeDivisor {
	static int getDivisor(int n) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i*i == n) count++;
				else count+=2;
			}
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int M = Integer.parseInt(tmp.split(" ")[2]), count = 0;
		
		for (int i = N; i <= M; i++) {
			if (getDivisor(i) == A) count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
