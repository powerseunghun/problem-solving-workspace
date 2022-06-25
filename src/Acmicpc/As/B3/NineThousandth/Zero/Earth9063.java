package Acmicpc.As.B3.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Earth9063 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = 0, y = 0;
		int x1 = Integer.MAX_VALUE, y1 = Integer.MAX_VALUE;
		int x2 = Integer.MIN_VALUE, y2 = Integer.MIN_VALUE;
		String tmp = null;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			x1 = Integer.min(x1, x);
			y1 = Integer.min(y1, y);
			x2 = Integer.max(x2, x);
			y2 = Integer.max(y2, y);
		}
		
		System.out.println((x2-x1) * (y2-y1));
		br.close();
	}
}
