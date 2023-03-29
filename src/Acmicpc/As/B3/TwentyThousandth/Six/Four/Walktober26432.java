package Acmicpc.As.B3.TwentyThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Walktober26432 {
	static long[][] arr = null;
	static long[] maxValue = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, P = 0;
		long res = 0;
		StringTokenizer st = null;
		String tmp = null;
		
		for (int tc = 1; tc <= T; tc++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			P = Integer.parseInt(tmp.split(" ")[2])-1;
			arr = new long[N][M];
			maxValue = new long[M];
			Arrays.fill(maxValue, -1);
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					arr[i][j] = Long.parseLong(st.nextToken());
					maxValue[j] = Math.max(maxValue[j], arr[i][j]);
				}
			}
			
			res = 0;
			for (int i = 0; i < M; i++) {
				res += maxValue[i] - arr[P][i];
			}
			sb.append("Case #" + tc + ": ").append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
