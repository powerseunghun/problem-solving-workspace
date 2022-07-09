package Acmicpc.As.B3.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RightTriangle9723 {
	static int[] arr = new int[3];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			sb.append("Case #" + i + ": ");
			tmp = br.readLine();
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(tmp.split(" ")[j]);
			}
			Arrays.sort(arr);
			
			if (Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == arr[2]) sb.append("YES\n");
			else sb.append("NO\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
