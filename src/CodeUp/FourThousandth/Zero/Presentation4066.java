package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Presentation4066 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int val = 0, cur = 0, item = 0;
		while (val < n) {
			item++;
			val++;
			cur++;
			if (cur == m) {
				val++;
				cur = 0;
			}
		}
		System.out.println(item);
	}
}
