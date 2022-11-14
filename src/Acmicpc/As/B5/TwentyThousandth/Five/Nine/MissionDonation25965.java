package Acmicpc.As.B5.TwentyThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissionDonation25965 {
	static long[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = 0;
		long res = 0, tVal = 0, val = 0;
		String tmp = null;
		
		while(N-- > 0) {
			res = 0;
			M = Integer.parseInt(br.readLine());
			arr = new long[M][3];
			for (int i = 0; i < arr.length; i++) {
				Arrays.fill(arr[i], 0L);
			}
			for (int i = 0; i < M; i++) {
				tmp = br.readLine();
				for (int j = 0; j < tmp.split(" ").length; j++) {
					arr[i][j] = Long.parseLong(tmp.split(" ")[j]);
				}
			}
			tmp = br.readLine();
			
			for (int i = 0; i < arr.length; i++) {
				val = 0;
				for (int j = 0; j < arr[i].length; j++) {
					tVal = arr[i][j] * Long.parseLong(tmp.split(" ")[j]);
					val += j == 1 ? tVal * -1 : tVal;
				}
				if (val < 0) continue;
				res += val;
			}
			sb.append(res + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
