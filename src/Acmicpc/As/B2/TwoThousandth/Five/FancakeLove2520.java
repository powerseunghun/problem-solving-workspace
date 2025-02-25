package Acmicpc.As.B2.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FancakeLove2520 {
	static int cm = 0, y = 0, ssu = 0, ssa = 0, f = 0, b = 0, gs = 0, gc = 0, w = 0;
	static int func() {
		int res1 = Math.min(cm*2, y*2);
		int res2 = Math.min(ssu*4, ssa*16);
		int res3 = Math.min(f*16/9, b+gs/30+gc/25+w/10);
		return Math.min(res1, Math.min(res2, res3));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		for (int i = 0; i < T; i++) {
			br.readLine();
			str = br.readLine();
			cm = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);
			ssu = Integer.parseInt(str.split(" ")[2]);
			ssa = Integer.parseInt(str.split(" ")[3]);
			f = Integer.parseInt(str.split(" ")[4]);
			
			str = br.readLine();
			b = Integer.parseInt(str.split(" ")[0]);
			gs = Integer.parseInt(str.split(" ")[1]);
			gc = Integer.parseInt(str.split(" ")[2]);
			w = Integer.parseInt(str.split(" ")[3]);
			
			sb.append(func()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
