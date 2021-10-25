package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomAssignment {
	static int function(int A, int B, int C, int N) {
		int sum = 0;
		for (int i = 0; i*A <= N; i++) {
			for (int j = 0; (i*A) + (B*j) <= N; j++) {
				for (int k = 0; (i*A) + (B*j) + (C*k) <= N; k++) {
					sum = (i*A) + (B*j) + (C*k);
					if (sum == N) return 1;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]);
		int N = Integer.parseInt(tmp.split(" ")[3]);
		
		System.out.println(function(A, B, C, N));
	}
}
