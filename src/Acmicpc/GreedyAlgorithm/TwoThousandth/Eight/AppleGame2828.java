package Acmicpc.GreedyAlgorithm.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppleGame2828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int j = Integer.parseInt(br.readLine());
		int l = 1, r = M, count = 0;
		
		for (int i = 0, apple = 0; i < j; i++) {
			apple = Integer.parseInt(br.readLine());
			while (l > apple || r < apple) {
				if (apple > r) {
					count++;
					r++;
					l++;
				}
				else if (apple < r) {
					count++;
					r--;
					l--;
				}
			}
		}
		System.out.println(count);
	}
}
