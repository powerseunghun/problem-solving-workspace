package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OctaNumericSystem {
	static String getOctaString(int N) {
		StringBuilder sb = new StringBuilder();
		int val = 0;
		while (N != 0) {
			val = N % 16;
			if (val >= 10) {
				sb.append((char)(val+87));
			}
			else sb.append(val);
			N /= 16;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getOctaString(N));
	}
}
