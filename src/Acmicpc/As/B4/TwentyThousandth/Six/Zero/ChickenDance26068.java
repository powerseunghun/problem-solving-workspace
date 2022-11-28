package Acmicpc.As.B4.TwentyThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChickenDance26068 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), d = 0, res = 0;
		
		while (T-- > 0) {
			d = Integer.parseInt(br.readLine().split("-")[1]);
			res = d <= 90 ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
