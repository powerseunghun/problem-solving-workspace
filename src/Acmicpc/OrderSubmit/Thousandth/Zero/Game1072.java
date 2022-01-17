package Acmicpc.OrderSubmit.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game1072 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int X = Integer.parseInt(tmp.split(" ")[0]);
		int Y = Integer.parseInt(tmp.split(" ")[1]);
		int Z = (int)((long)Y * 100 / X), res = -1;
		int left = 0, right = 1000000000, mid = 0;
		
		while (left <= right) {
			mid = (left + right) / 2;
			int ny = Y+mid;
			int nx = X+mid;
			int val = (int)((long)ny * 100 / nx);
			if (val != Z) {
				res = mid;
				right = mid-1;
			}
			else left = mid+1;
		}
		System.out.println(res);
		br.close();
	}
}
