package Acmicpc.As.B5.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle29751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int W = Integer.parseInt(str.split(" ")[0]);
		int H = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(String.format("%.1f", (W * H / 2.0)));
		br.close();
	}
}
