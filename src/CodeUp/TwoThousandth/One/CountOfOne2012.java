package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfOne2012 {
	static int getCount(int n) {
		int count = 0;
		while (n != 0) {
			if (n % 10 == 1) {
				count++;
			}
			n /= 10;
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int count = 0;
		
		for (int i = a; i <= b; i++) {
			count += getCount(i);
		}
		
		System.out.println(count);
	}
}
