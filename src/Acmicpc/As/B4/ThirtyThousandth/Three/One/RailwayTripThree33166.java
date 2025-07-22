package Acmicpc.As.B4.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RailwayTripThree33166 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int p = Integer.parseInt(str.split(" ")[0]);
		int q = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(q<=p ? q*a : p*a+(q-p)*b);
		br.close();
	}
}
