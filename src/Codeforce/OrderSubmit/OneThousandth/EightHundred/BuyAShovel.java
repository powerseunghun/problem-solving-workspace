package Codeforce.OrderSubmit.OneThousandth.EightHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuyAShovel {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int k = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		
		for (int i = 1; ; i++) {
			if (((k * i) % 10 == 0) || ((k * i) % 10 == r)) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
