package SWExpertAcademy.D3.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpotMart9229 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, max = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			max = -1;
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if (arr[j] + arr[k] <= M) {
						max = Math.max(max, arr[j]+arr[k]);
					}
				}
			}
			sb.append("#" + i + " " + max + "\n");
		}
		System.out.print(sb.toString());
	}
}
