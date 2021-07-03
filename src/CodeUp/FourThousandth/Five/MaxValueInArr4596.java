package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxValueInArr4596 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int max = 0, x = 0, y = 0;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0, val = 0; j < 9; j++) {
				val = Integer.parseInt(st.nextToken());
				if (val >= max) {
					max = val;
					x = i+1;
					y = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}
