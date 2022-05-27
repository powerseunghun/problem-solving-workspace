package Acmicpc.As.B3.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transactions2975 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		char com = ' ';
		int start = 0, money = 0, diff = 0;
		
		while (true) {
			tmp = br.readLine();
			start = Integer.parseInt(tmp.split(" ")[0]);
			com = tmp.split(" ")[1].charAt(0);
			money = Integer.parseInt(tmp.split(" ")[2]);
			
			if (start == 0 && com == 'W' && money == 0) break;
			
			diff = com == 'W' ? start-money : start+money;
			sb.append(diff < -200 ? "Not allowed\n" : (diff + "\n"));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
