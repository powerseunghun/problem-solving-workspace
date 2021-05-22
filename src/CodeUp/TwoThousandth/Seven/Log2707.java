package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Log2707 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 2; ; i++) {
			for (int j = 1; ; j++) {
				if (Math.pow(i, j) > N) break;
				if (Math.pow(i, j) == N) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}
