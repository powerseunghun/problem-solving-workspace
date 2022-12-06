package Acmicpc.As.B2.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pet1362 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int o = 0 , w = 0, sc = 1, n = 0;
		char c = ' ';
		boolean flag = true;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			o = Integer.parseInt(tmp.split(" ")[0]);
			w = Integer.parseInt(tmp.split(" ")[1]);
			if (o == 0 && w == 0) break;
			flag = true;
			while (true) {
				tmp = br.readLine();
				c = tmp.split(" ")[0].charAt(0);
				n = Integer.parseInt(tmp.split(" ")[1]);
				if (c == '#' && n == 0) break;
				switch(c) {
				case 'F':
					w += n;
					break;
				case 'E':
					w -= n;
					w = Math.max(0, w);
					break;
				}
				flag = w == 0 ? false : flag;
			}
			sb.append((sc++) + " " + (!flag ? "RIP" : (w  > (o / 2.0) && w < o*2) ? ":-)" : ":-(") + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
