package SWExpertAcademy.D3.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxGradeCard4466 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		Integer[] arr = null;
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0, sum = 0;
		
		for (int i = 1; i <= T; i++) {
			sum = 0;
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			arr = new Integer[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, Collections.reverseOrder());
			
			for (int j = 0; j < K; j++) {
				sum += arr[j];
			}
			sb.append("#" + i + " " + sum + "\n");
		}
		System.out.print(sb.toString());
	}
}
