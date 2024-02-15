package Acmicpc.As.B5.ThirtyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnEasyPeasyProblem30214 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double s1 = Double.parseDouble(str.split(" ")[0]);
		double s2 = Double.parseDouble(str.split(" ")[1]);
		
		System.out.println(s1 >= s2/2 ? "E" : "H");
		br.close();
	}
}