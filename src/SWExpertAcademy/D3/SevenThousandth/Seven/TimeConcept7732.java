package SWExpertAcademy.D3.SevenThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TimeConcept7732 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), h = 0, m = 0, s = 0, res = 0;
		int[] arr = new int[2];
		
		for (int i = 1; i <= T; i++) {
			for (int j = 0; j < arr.length;j ++) {
				st = new StringTokenizer(br.readLine(), ":");
				h = Integer.parseInt(st.nextToken());
				m = Integer.parseInt(st.nextToken());
				s = Integer.parseInt(st.nextToken());
				arr[j] = h * 3600 + m * 60 + s;
			}
			if (arr[0] > arr[1]) {
				res = arr[1]-arr[0]+3600*24;
			}
			else res = arr[1]-arr[0];
			str = String.format("#" + i + " %02d:%02d:%02d\n", res/3600, (res%3600)/60, (res%3600)%60);
			sb.append(str);
		}
		System.out.print(sb.toString());
	}
}
