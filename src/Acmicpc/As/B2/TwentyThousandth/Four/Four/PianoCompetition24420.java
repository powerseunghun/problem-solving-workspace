package Acmicpc.As.B2.TwentyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PianoCompetition24420 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, res = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			res += v;
			max = Math.max(max, v);
			min = Math.min(min, v);
		}
		
		System.out.println(res - max - min);
		br.close();
	}
}
