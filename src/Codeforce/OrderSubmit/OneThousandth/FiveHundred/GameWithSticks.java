package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameWithSticks {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int res = Integer.MAX_VALUE;
		
		for (int i = 0; i < tmp.length; i++) {
			res = Math.min(res, Integer.parseInt(tmp[i]));
		}
		
		System.out.println(res % 2 == 0 ? "Malvika" : "Akshat");
		br.close();
	}
}
