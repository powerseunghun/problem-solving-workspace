package Acmicpc.As.B3.ThirtyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArtisticSouvenir30886 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		double res = Math.pow(Math.sqrt(a/Math.acos(-1))*2+2, 2);
		
		System.out.println(String.format("%.10f", res));
		br.close();
	}
}
