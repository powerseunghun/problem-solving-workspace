package Codeforce.OrderSubmit.OneThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoldierAndBananas {
	static int getNeedDollar(int k, int h) {
		return (h * ((2 * k) + (h-1) * k)) / 2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int k = Integer.parseInt(tmp.split(" ")[0]);
		int w = Integer.parseInt(tmp.split(" ")[1]);
		int h = Integer.parseInt(tmp.split(" ")[2]);
		int needDollar = getNeedDollar(k, h);
		
		System.out.println(needDollar > w ? needDollar-w : 0);
		br.close();
	}
}
