package Acmicpc.As.B5.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pups26575 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double n = 0, f = 0, p = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			n = Double.parseDouble(tmp.split(" ")[0]);
			f = Double.parseDouble(tmp.split(" ")[1]);
			p = Double.parseDouble(tmp.split(" ")[2]);
			
			sb.append(String.format("$%.2f\n",(n*f*p)));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
