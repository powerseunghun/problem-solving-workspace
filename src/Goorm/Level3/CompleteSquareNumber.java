package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompleteSquareNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]), sum = 0, min = 0;
		
		for (int i = M; i <= N; i++) {
			if (Math.sqrt(i) == (int)Math.sqrt(i)) {
				if (sum == 0) min = i;
				sum += i;
			}
		}
		
		System.out.println(min + " " + sum);
	}
}
