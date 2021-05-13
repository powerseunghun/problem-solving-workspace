package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctoberThirty1716 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int m = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]);
		int sum = 0;
		
		for (int i = m; i <= 10; i++) {
			if (i == m) {
				sum += i % 2 == 0 ? 30-d : 31-d;
				continue;
			}
			sum += i % 2 == 0 ? 30 : 31;
		}
		System.out.println(sum);
	}
}
