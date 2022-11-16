package Acmicpc.As.B4.TwentyThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastestestFunction25985 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double x = Double.parseDouble(tmp.split(" ")[0]);
		double y = Double.parseDouble(tmp.split(" ")[1]);
		
		System.out.println((x*(100-y))/(y*(100-x)));
		br.close();
	}
}
