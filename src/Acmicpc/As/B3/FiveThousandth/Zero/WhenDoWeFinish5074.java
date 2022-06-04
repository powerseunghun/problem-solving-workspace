package Acmicpc.As.B3.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhenDoWeFinish5074 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] tmp = null;
		int sh = 0, sm = 0, rh = 0, rm = 0, time = 0;
		int h = 0, m = 0, d = 0;
		
		while (true) {
			tmp = br.readLine().split(" ");
			sh = Integer.parseInt(tmp[0].split(":")[0]);
			sm = Integer.parseInt(tmp[0].split(":")[1]);
			rh = Integer.parseInt(tmp[1].split(":")[0]);
			rm = Integer.parseInt(tmp[1].split(":")[1]);
			if (sh == 0 && sm == 0 && rh == 0 && rm == 0) break;
			time = (sh*60+sm) + (rh*60+rm);
			
			h = time/60 % 24;
			d = time/60/24;
			m = time%60;
			sb.append(String.format(String.format("%02d:%02d ", h, m) + (d > 0 ? String.format("+%d\n", d) : "\n")));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
