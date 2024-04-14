package Acmicpc.As.B3.TwentyThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreePointsForWin21022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0, b = 0, s = 0;
		br.readLine();
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		while(st1.hasMoreTokens() && st2.hasMoreTokens()) {
			b = Integer.parseInt(st1.nextToken());
			s = Integer.parseInt(st2.nextToken());
			
			res = b == s ? res+1 : b > s ? res+3 : res+0;
		}
		
		System.out.println(res);
		br.close();
	}
}
