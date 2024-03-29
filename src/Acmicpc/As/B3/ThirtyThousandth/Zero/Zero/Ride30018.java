package Acmicpc.As.B3.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ride30018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v = 0, res = 0;
		br.readLine();
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		while(st1.hasMoreTokens()) {
			v = Integer.parseInt(st2.nextToken()) - Integer.parseInt(st1.nextToken());
			res += v > 0 ? Math.abs(v) : 0;
		}
		
		System.out.println(res);
		br.close();
	}
}
