package Acmicpc.As.B3.TwentyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cakes21212 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE, a = 0, b = 0;
		String tmp = null;
		
		while (N-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			min = Math.min(min, (int)(b/a));
		}
		
		System.out.println(min);
		br.close();
	}
}
