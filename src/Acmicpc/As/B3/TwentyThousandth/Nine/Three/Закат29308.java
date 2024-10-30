package Acmicpc.As.B3.TwentyThousandth.Nine.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Закат29308 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0, max = Integer.MIN_VALUE;
		String str = null, res = null;
		
		while(N-- > 0) {
			str = br.readLine();
			v = Integer.parseInt(str.split(" ")[0]);
			if (v > max && str.split(" ")[2].equals("Russia")) {
				res = str.split(" ")[1];
				max = v;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
