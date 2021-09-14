package SWExpertAcademy.D3.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SteepleChase6730 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, upMax = 0, downMax = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			upMax = 0;
			downMax = 0;
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] < arr[j+1]) {
					upMax = Math.max(upMax, arr[j+1]-arr[j]);
				}
				else if (arr[j] > arr[j+1]) {
					downMax = Math.max(downMax, arr[j]-arr[j+1]);
				}
			}
			sb.append("#" + i + " " + upMax + " " + downMax + "\n");
		}
		System.out.print(sb.toString());
	}
}
