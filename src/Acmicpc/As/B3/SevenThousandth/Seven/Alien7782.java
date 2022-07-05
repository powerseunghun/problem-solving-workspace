package Acmicpc.As.B3.SevenThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alien7782 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int b1 = Integer.parseInt(tmp.split(" ")[0]), b2 = Integer.parseInt(tmp.split(" ")[1]);
		int lx = 0, ly = 0, hx = 0, hy = 0;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			lx = Integer.parseInt(tmp.split(" ")[0]);
			ly = Integer.parseInt(tmp.split(" ")[1]);
			hx = Integer.parseInt(tmp.split(" ")[2]);
			hy = Integer.parseInt(tmp.split(" ")[3]);
			if ((lx <= b1 && hx >= b1) && (ly <= b2 && hy >= b2)) {
				sb.append("Yes\n");
				break;
			}
		}
		if (sb.toString().equals("")) sb.append("No\n");
		System.out.print(sb.toString());
		br.close();
	}
}
