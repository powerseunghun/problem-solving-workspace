package Acmicpc.As.B3.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AdvancedMathematics7510 {
	static int[] arr = new int[3];
	static boolean check() {
		if (Math.pow(arr[2], 2) == Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) return true;
		else return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), idx = 1;
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i]= Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			sb.append("Scenario #" + (idx++) + ":\n" + (check() ? "yes" : "no"));
			sb.append("\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
