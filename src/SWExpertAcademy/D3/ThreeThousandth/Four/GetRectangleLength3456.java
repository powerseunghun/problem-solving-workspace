package SWExpertAcademy.D3.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GetRectangleLength3456 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[101];
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			Arrays.fill(arr, 0);
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				arr[Integer.parseInt(st.nextToken())]++;
			}
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] != 0 && arr[j] % 2 != 0) {
					sb.append("#" + i + " " + j + "\n");
					break;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
