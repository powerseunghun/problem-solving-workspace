package Acmicpc.As.B3.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz14761 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int X = Integer.parseInt(tmp.split(" ")[0]);
		int Y = Integer.parseInt(tmp.split(" ")[1]);
		int N = Integer.parseInt(tmp.split(" ")[2]);

		for (int i = 1; i <= N; i++) {
			if (i % X == 0 && i % Y == 0) sb.append("FizzBuzz\n");
			else if (i % X == 0) sb.append("Fizz\n");
			else if (i % Y == 0) sb.append("Buzz\n");
			else sb.append(i + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
