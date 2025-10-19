package Acmicpc.As.B3.TwentyThousandth.Nine.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Огнисветофора29412 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, d = 0;
		int g = Integer.parseInt(str.split(" ")[0]);
		int gb = Integer.parseInt(str.split(" ")[1]);
		int y = Integer.parseInt(str.split(" ")[2]);
		int r = Integer.parseInt(str.split(" ")[3]);
		int ry = Integer.parseInt(str.split(" ")[4]);
		
		while(d<T) {
			int e = Math.min(g, T-d);
			c += e;
			d += e;
			if (d >= T) break;
			e = Math.min(gb, T-d);
			c += e/2;
			d += e;
			if (d >= T) break;
			e = Math.min(y, T-d);
			b += e;
			d += e;
			if (d >= T) break;
			e = Math.min(r, T-d);
			a += e;
			d += e;
			if (d >= T) break;
			e = Math.min(ry, T-d);
			a += e;
			b += e;
			d += e;
		}
		
		System.out.println(a + " " + b + " " + c);
		br.close();
	}
}
