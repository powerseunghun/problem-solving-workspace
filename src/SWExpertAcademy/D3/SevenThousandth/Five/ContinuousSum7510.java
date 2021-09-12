package SWExpertAcademy.D3.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuousSum7510 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, sum = 0, cnt = 0;
		
		for (int i = 1; i <= T; i++) {
			cnt = 1;
			N = Integer.parseInt(br.readLine());
			for (int j = 1; j <= N/2; j++) {
				sum = j;
				for (int k = j+1; j+k <= N; k++) {
					sum += k;
					if (sum >= N) {
						if (sum == N) cnt++;
						break;
					}
					else if (sum > N) break;
				}
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
