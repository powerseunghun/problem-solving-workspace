package Acmicpc.As.B2.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiftyCoatsOfGray4697 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int n = 0, w = 0, l = 0, h = 0, a = 0, m = 0, x = 0, y = 0, res = 0;
		
		while(true) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			w = Integer.parseInt(str.split(" ")[1]);
			l = Integer.parseInt(str.split(" ")[2]);
			h = Integer.parseInt(str.split(" ")[3]);
			a = Integer.parseInt(str.split(" ")[4]);
			m = Integer.parseInt(str.split(" ")[5]);
			
			if (n == 0 && w == 0 && l == 0 && h == 0 && a == 0 && m == 0) break;
			res = w*l*n+2*(w+l)*h*n;
			
			while(m-- > 0) {
				str = br.readLine();
				x = Integer.parseInt(str.split(" ")[0]);
				y = Integer.parseInt(str.split(" ")[1]);
				res -= x*y*n;
			}
			sb.append((res+a-1) / a).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
