package Acmicpc.As.B3.TwentyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FergusonballRatings24569 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0, g = 0, p = 0;
		
		for (int i = 1, s = 0; i <= N; i++) {
			g = Integer.parseInt(br.readLine());
			p = Integer.parseInt(br.readLine());
			s = 5*g - 3*p;
			res = s > 40 ? res+1 : res;
		}
		
		System.out.print(res + (res==N ? "+\n" : "\n"));
		br.close();
	}
}
