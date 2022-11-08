package Acmicpc.As.B3.TenThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraÓtica13667 {
	static int[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		boolean flag = false;
		int N = 0, idx = 0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			arr = new int[N][5];
			
			for (int i = 0; i < N; i++) {
				tmp = br.readLine();
				flag = false;
				idx = Integer.MAX_VALUE;
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
					if (arr[i][j] <= 127) {
						if (flag) {
							idx = 6;
							break;
						}
						flag = true;
						idx = j;
					}
				}
				sb.append(idx > 5 ? "*\n" : (char)(idx+65)+"\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
