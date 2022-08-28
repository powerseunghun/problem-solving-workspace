package Acmicpc.As.B3.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShatteredCake15415 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int W = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine()), sum = 0;
		String tmp = null;
		
		for (int i = 0, a = 0, b = 0; i < N; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			sum += a*b;
		}
		
		System.out.println(sum / W);
		br.close();
	}
}
