package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RadonMeasure4081 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] base = {74, 100, 148};
		boolean check = false;
		StringBuilder sb = new StringBuilder();
		
		if (!(n >= 1 && n <= 1000)) {
			System.out.println(n + " data error");
			return;
		}
		sb.append(n + " ");
		
		for (int i = 0; i < base.length; i++) {
			if (n < base[i]) {
				switch(i) {
				case 0:
					sb.append("blue recommend");
					break;
				case 1:
					sb.append("green possible");
					break;
				case 2:
					sb.append("yellow careful");
					break;
				}
				check = true;
				break;
			}
		}
		if(!check) sb.append("red stop");
		
		System.out.println(sb.toString());
	}
}
