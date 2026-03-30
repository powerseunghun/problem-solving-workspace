package Acmicpc.As.B4.ThirtyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DimigoChallenge35409 {
	static boolean func(int W) {
		return (390 <= W && W <= 540) || (590 <= W && W <= 600) || (650 <= W && W <= 660) || 
				(710 <= W && W <= 720) || (770 <= W && W <= 830) || (880 <= W && W <= 890) || 
				(940 <= W && W <= 950) || (1000 <= W && W <= 1370);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int H = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);

		System.out.println(func(H*60+M) ? "Yes" : "No");
		br.close();
	}
}
