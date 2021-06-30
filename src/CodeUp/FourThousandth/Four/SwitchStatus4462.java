package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SwitchStatus4462 {
	static void maleCheck(int num, int[] sw) {
		for (int i = 1; i < sw.length; i++) {
			if (i % num == 0) {
				sw[i] = sw[i] == 0 ? 1 : 0;
			}
		}
	}
	static void femaleCheck(int num, int[] sw) {
		int left = num-1;
		int right = num+1;
		sw[num] = sw[num] == 0 ? 1 : 0;
		while (left >= 1 && right < sw.length) {
			if (sw[left] == sw[right]) {
				sw[left] = sw[left] == 0 ? 1 : 0;
				sw[right] = sw[right] == 0 ? 1 : 0;
				left--;
				right++;
			}
			else break;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine()), gender = 0, num = 0, st = 0;
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int[] sw = new int[n+1];
		sw[0] = Integer.MAX_VALUE;
		
		for (int i = 1; i <= n; i++) {
			sw[i] = Integer.parseInt(stk.nextToken());
		}
		st = Integer.parseInt(br.readLine());
		for (int i = 0; i < st; i++) {
			tmp = br.readLine();
			gender = Integer.parseInt(tmp.split(" ")[0]);
			num = Integer.parseInt(tmp.split(" ")[1]);
			switch(gender) {
			case 1:
				maleCheck(num, sw);
				break;
			case 2:
				femaleCheck(num, sw);
				break;
			}
		}
		
		for (int i = 1; i < sw.length; i++) {
			System.out.print(sw[i] + " ");
			if (i % 20 == 0) System.out.println();
		}
	}
}
