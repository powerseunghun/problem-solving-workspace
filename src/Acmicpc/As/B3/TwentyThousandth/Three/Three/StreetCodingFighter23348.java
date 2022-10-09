package Acmicpc.As.B3.TwentyThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StreetCodingFighter23348 {
	static int[] scores = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		String tmp = br.readLine();
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, max = 0;
		scores[0] = Integer.parseInt(tmp.split(" ")[0]);
		scores[1] = Integer.parseInt(tmp.split(" ")[1]);
		scores[2] = Integer.parseInt(tmp.split(" ")[2]);
		
		for (int i = 1, score = 0; i <= 3*N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < scores.length; j++) {
				score += scores[j] * Integer.parseInt(st.nextToken());
			}
			if (i % 3 != 0) continue;
			max = Math.max(score, max);
			score = 0;
		}
		
		System.out.println(max);
		br.close();
	}
}
