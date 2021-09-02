package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberSort1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			tmp = br.readLine();
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(tmp.split(" ")[j]);
			}
			Arrays.sort(arr);
			sb.append("#" + i + " ");
			for (int el : arr) {
				sb.append(el + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
