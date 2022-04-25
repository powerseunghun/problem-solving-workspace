package Acmicpc.OrderSubmit.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImHappy14652 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]), X = 0, Y = 0;
		
		while (!((M*X) <= K && K <= ((M*X) + (M-1)))) {
			X++;
		}
		Y = K - M*X;
		
		System.out.println(X + " " + Y);
		br.close();
	}
}
