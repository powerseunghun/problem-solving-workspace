package Acmicpc.As.B2.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LectureReview34845 {
	static final int w = 100;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]), CN = N;
		int X = Integer.parseInt(str.split(" ")[1]), s = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			s += Integer.parseInt(st.nextToken());
		}
		
		while (s < N*X) {
			s += w;
			N++;
		}
		
		System.out.println(N-CN);
		br.close();
	}
}
