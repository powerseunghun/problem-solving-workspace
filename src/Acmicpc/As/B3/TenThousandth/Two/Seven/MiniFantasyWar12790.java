package Acmicpc.As.B3.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MiniFantasyWar12790 {
	static int[] arr = null;
	static int getPower() {
		return 1*Math.max(arr[0],1) + 5*Math.max(arr[1], 1) + 2*Math.max(arr[2],0) + 2*arr[3];
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			arr = new int[4];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[j] += Integer.parseInt(st.nextToken());
				}
			}
			sb.append(getPower() + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
