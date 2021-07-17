package Acmicpc.Step20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideAndConquerPower1629 {
	static long getPower(int A, int B, int C) {
		if (B == 1) return A % C;
		else if (B == 0) return 1;
		else {
			long tmp = getPower(A, B/2, C);
			if (B % 2 == 0) return tmp * tmp % C;
			else return (tmp * tmp % C) * A % C;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]);
		
		System.out.println(getPower(A, B, C));
	}
}
