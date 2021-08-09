package Acmicpc.BruteForceAlgorithm.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomAssignment14697 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]);
		int N = Integer.parseInt(tmp.split(" ")[3]);
		
		for (int i = 0; i <= 50; i++) {
			for (int j = 0; j <= 50; j++) {
				for (int k = 0; k <= 50; k++) {
					if ((A*i) + (B*j) + (C*k) == N) {
						System.out.println("1");
						return;
					}
				}
			}
		}
		
		System.out.println("0");
	}
}
