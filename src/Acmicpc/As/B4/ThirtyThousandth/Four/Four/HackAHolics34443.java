package Acmicpc.As.B4.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackAHolics34443 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.readLine();
		int P = Integer.parseInt(br.readLine());
		
		System.out.println(N*P);
		br.close();
	}
}
