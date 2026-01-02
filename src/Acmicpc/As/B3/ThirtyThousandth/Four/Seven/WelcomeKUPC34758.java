package Acmicpc.As.B3.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WelcomeKUPC34758 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int X = Integer.parseInt(str.split(" ")[0]);
		int Y = Integer.parseInt(str.split(" ")[1]);
		int N = Integer.parseInt(br.readLine()), xi = 0, yi = 0;
		
		while(N-- > 0) {
			str = br.readLine();
			xi = Integer.parseInt(str.split(" ")[0]);
			yi = Integer.parseInt(str.split(" ")[1]);
			
			sb.append(xi != X && yi != Y ? 1 : 0).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
