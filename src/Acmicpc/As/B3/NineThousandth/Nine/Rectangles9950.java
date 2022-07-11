package Acmicpc.As.B3.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangles9950 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int l = 0, w = 0, a = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			l = Integer.parseInt(tmp.split(" ")[0]);
			w = Integer.parseInt(tmp.split(" ")[1]);
			a = Integer.parseInt(tmp.split(" ")[2]);
			if (l == 0 && w == 0 && a == 0) break;
			if (a == 0) a = l*w;
			else if (l == 0) l = a/w;
			else w = a/l;
			sb.append(l + " " + w + " " + a + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
