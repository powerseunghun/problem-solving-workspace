package Acmicpc.OrderSubmit.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intelligence2460 {
	static final int station = 10;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int in = 0, max = Integer.MIN_VALUE;
		
		for (int i = 0, a = 0, b = 0; i < station; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			in -= a;
			in += b;
			if (in > 10000) in = 10000;
			max = Math.max(max, in);
		}
		
		System.out.println(max);
		br.close();
	}
}
