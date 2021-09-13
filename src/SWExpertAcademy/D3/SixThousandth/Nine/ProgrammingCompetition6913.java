package SWExpertAcademy.D3.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgrammingCompetition6913 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int[][] arr = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, max = 0, cnt = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			max = Integer.MIN_VALUE;
			cnt = 0;
			arr = new int[N][M+1];
			for (int j = 0, val = 0; j < N; j++) {
				tmp = br.readLine();
				val = 0;
				for (int k = 0; k < M; k++) {
					arr[j][k] = Integer.parseInt(tmp.split(" ")[k]);
					val += arr[j][k];
				}
				arr[j][M] = val;
				max = Math.max(arr[j][M], max);
			}
			for (int j = 0; j < N; j++) {
				if (arr[j][M] == max) cnt++;
			}
			
			sb.append("#" + i + " " + cnt + " " + max + "\n");
		}
		System.out.print(sb.toString());
	}
}
