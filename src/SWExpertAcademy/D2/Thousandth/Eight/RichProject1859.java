package SWExpertAcademy.D2.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RichProject1859 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, maxVal = 0;
		long sum = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			sum = 0;
			maxVal = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = arr.length-1; j >= 0; j--) {
				if (arr[j] > maxVal) maxVal = arr[j];
				else {
					sum += maxVal - arr[j];
				}
			}
			sb.append("#" + i + " " + sum + "\n");
		}
		System.out.print(sb.toString());
	}
}
