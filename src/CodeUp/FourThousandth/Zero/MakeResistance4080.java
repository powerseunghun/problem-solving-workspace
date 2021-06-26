package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class MakeResistance4080 {
	static int count = 0;
	static void solution(int sum, int R, int cnt, Integer[] rss) {
		if (R == sum) {
			count = Math.min(count, cnt);
			return;
		}
		if (sum > R) return;
		Arrays.sort(rss, Collections.reverseOrder());
		
		for (int i = 0; i < rss.length; i++) {
			solution(sum+rss[i], R, cnt+1, rss);
//			if (rss[i] <= (R-sum)) {
//				count++;
//				solution(sum+rss[i], R, rss);
//			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		int[] addR = {3, 6, 11}, minR = new int[3];
		Integer[] baseR = {1, 5, 9, 0};
		Integer[] rss = null;
		
		for (int i = 0; i < addR.length; i++) {
			count = 2001;
			rss = baseR.clone();
			rss[3] = addR[i];
			
			// rss 를 parameter
			solution(0, R, 0, rss);
			minR[i] = count;
		}
		for (int i = 0; i < minR.length; i++) {
			System.out.print(minR[i]);
			if (i != minR.length-1) System.out.print(" ");
		}
	}
}
