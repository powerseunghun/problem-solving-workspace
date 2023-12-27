package Acmicpc.As.S5.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FinalWinner12760 {
	static int[] max = null, cnt = null;;
	static int[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), maxVal = 0;
		arr = new int[N][M];
		max = new int[M];
		cnt = new int[N];
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
			Arrays.sort(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				max[j] = Math.max(max[j], arr[i][j]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				cnt[i] = max[j] == arr[i][j] ? cnt[i]+1 : cnt[i];
			}
			maxVal = Math.max(cnt[i], maxVal);
			
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == maxVal) {
				sb.append(i+1).append(" ");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
