package Acmicpc.As.B3.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarifa13484 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine()), P = 0, rem = X;
		
		while(N-- > 0) {
			P = Integer.parseInt(br.readLine());
			if (P > rem) continue;
			rem += (X-P);
		}
		
		System.out.println(rem);
		br.close();
	}
}
