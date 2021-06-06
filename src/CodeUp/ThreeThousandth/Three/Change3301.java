package CodeUp.ThreeThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change3301 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), cnt = 0, idx = 0;
		int[] m = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		
		while (n > 0) {
			cnt += n / m[idx];
			n = n - (m[idx] * (n / m[idx]));
			idx++;
		}
		
		System.out.println(cnt);
	}
}
