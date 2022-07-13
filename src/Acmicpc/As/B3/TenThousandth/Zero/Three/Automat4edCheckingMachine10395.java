package Acmicpc.As.B3.TenThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Automat4edCheckingMachine10395 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		char c = 'Y';
		
		while (st1.hasMoreTokens()) {
			if (st1.nextToken().equals(st2.nextToken())) {
				c = 'N';
				break;
			}
		}
		
		System.out.println(c);
		br.close();
	}
}
