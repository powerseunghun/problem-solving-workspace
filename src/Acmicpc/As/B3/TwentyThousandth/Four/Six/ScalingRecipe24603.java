package Acmicpc.As.B3.TwentyThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScalingRecipe24603 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int x = Integer.parseInt(tmp.split(" ")[1]);
		int y = Integer.parseInt(tmp.split(" ")[2]);
		double a = 0;
		
		while(n-- > 0) {
			a = Double.parseDouble(br.readLine());
			sb.append((int)(y * (a/x)) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
