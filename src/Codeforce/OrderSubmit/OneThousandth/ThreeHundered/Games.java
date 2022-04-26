package Codeforce.OrderSubmit.OneThousandth.ThreeHundered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Games {
	static int[] home = null;
	static int[] away = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		String tmp = null;
		home = new int[N];
		away = new int[N];
		
		for (int i = 0, h = 0, a = 0; i < N; i++) {
			tmp = br.readLine();
			h = Integer.parseInt(tmp.split(" ")[0]);
			a = Integer.parseInt(tmp.split(" ")[1]);
			home[i] = h;
			away[i] = a;
		}
		
		for (int i = 0; i < home.length; i++) {
			for (int j = 0; j < away.length; j++) {
				if (i==j) continue;
				if (home[i] == away[j]) count++;
			}
		}
		br.close();
		System.out.println(count);
	}
}
