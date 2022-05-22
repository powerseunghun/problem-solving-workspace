package Acmicpc.As.B4.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moving24079 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double X = Double.parseDouble(br.readLine());
		double Y = Double.parseDouble(br.readLine());
		double Z = Double.parseDouble(br.readLine());
		
		System.out.println(X+Y <= Z+0.5 ? 1 : 0);
		br.close();
	}
}
