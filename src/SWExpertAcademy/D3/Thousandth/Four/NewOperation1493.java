package SWExpertAcademy.D3.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewOperation1493 {
	static int func(int p, int q) {
		int x = 0, y = 0;
		int sum = 0, v1 = 0, v2 = 0, flag = 0;
		for (int t = 0; t < 2; t++) {
			sum = 0;
			v1 = 0;
			v2 = 0;
			if (t == 0) flag = p;
			else flag = q;
			
			for (int i = 1; ; i++) {
				sum += i;
				if (sum >= flag) {
					v1 = i-(sum-flag);
					v2 = (i+1)-v1;
					break;
				}
			}
			x += v1;
			y += v2;
		}
		sum = 0;
		for (int i = 1; i <(x+y)-1; i++) {
			sum += i;
		}
		return sum+x;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), p = 0, q = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			p = Integer.parseInt(tmp.split(" ")[0]);
			q = Integer.parseInt(tmp.split(" ")[1]);
			sb.append("#" + i + " " + func(p, q) + "\n");
		}
		System.out.print(sb.toString());
	}
}
