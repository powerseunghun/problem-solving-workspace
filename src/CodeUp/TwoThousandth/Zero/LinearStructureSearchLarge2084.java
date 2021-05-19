package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LinearStructureSearchLarge2084 {
	static int getIndex(int[] num, int k) {
		int f = 0, b = num.length - 1, key = 0;
		while(f <= b) {
			key = (f + b) / 2;
			if (num[key] == k) return key + 1; 
			if (k <= num[key]) {
				b = key - 1;
			}
			else {
				f = key + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		int r = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < r; i++) {
			System.out.println(getIndex(num, Integer.parseInt(br.readLine())));
		}
	}
}
