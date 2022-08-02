package Acmicpc.As.B3.TenThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangYongClock12840 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int h = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int s = Integer.parseInt(tmp.split(" ")[2]);
		int q = Integer.parseInt(br.readLine()), T = 0, c = 0, t = 0;
		
		t = h*3600 + m*60 + s;
		while (q-- > 0) {
			tmp = br.readLine();
			T = Integer.parseInt(tmp.split(" ")[0]);
			switch(T) {
			case 1: case 2:
				c = Integer.parseInt(tmp.split(" ")[1]);
				t += T == 1 ? c : (c*-1);
				while (t < 0) t+=86400;
				t = t%86400;
				break;
			case 3:
				System.out.println((t/3600) + " " + (t/60)%60 + " " + t%60);
				break;
			}
		}
		
		br.close();
	}
}
