package Acmicpc.As.B4.ThirtyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FairGrading34282 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0, v = 0;
		
		while(true) {
			v = Integer.parseInt(st.nextToken());
			sum += v;
			if (!st.hasMoreTokens()) {
				sum += v;
				break;
			}
		}
		System.out.println(sum >= 360 ? "A" : sum >= 320 ? "B" : sum >= 280 ? "C" : sum >= 240 ? "D" : "F");
		br.close();
	}
}
