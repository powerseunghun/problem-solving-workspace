package Acmicpc.As.B3.TenThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisposableCup13129 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int N = Integer.parseInt(tmp.split(" ")[2]);
		int b = (A+B) + (N-1) * A;
		
		for (int i = 0; i < N; i++) {
			sb.append((b + (B * i)) + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
