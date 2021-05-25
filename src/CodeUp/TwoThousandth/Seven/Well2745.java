package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Well2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long a = Long.parseLong(tmp.split(" ")[0]);
		long b = Long.parseLong(tmp.split(" ")[1]);
		long c = Long.parseLong(tmp.split(" ")[2]);
		long n = (a / (b - c))-(b / (b - c));
		double tval = (b-c) * n;
		int count = 0;
		
		while (true) {
			count++;
			tval += b;
			if (tval >= a) break;
			tval -= c;
		}
		
		System.out.println((int)(n + count));
	}
}
