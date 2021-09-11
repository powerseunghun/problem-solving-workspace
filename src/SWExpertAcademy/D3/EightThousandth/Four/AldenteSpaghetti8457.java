package SWExpertAcademy.D3.EightThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AldenteSpaghetti8457 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		StringTokenizer st = null;
		int[] arr = null;
		int T = Integer.parseInt(br.readLine()), N = 0, B = 0, E = 0, cnt = 0;
		int b1 = 0, b2 = 0;
		
		for (int i = 1; i <= T; i++) {
			cnt = 0;
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			E = Integer.parseInt(tmp.split(" ")[2]);
			b1 = B-E;
			b2 = B+E;
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < arr.length; j++) {
				for (int k = b1; k <= b2; k++) {
					if (k % arr[j] == 0) {
						cnt++;
						break;
					}
				}
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
