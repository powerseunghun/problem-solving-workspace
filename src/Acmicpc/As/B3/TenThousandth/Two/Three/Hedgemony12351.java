package Acmicpc.As.B3.TenThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hedgemony12351 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		double[] arr = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		double avg = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new double[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Double.parseDouble(st.nextToken());
			}
			for (int j = 1; j < arr.length-1; j++) {
				avg = (arr[j-1] + arr[j+1]) / 2;
				if (arr[j] <= avg) continue;
				arr[j] = avg;
			}
			sb.append("Case #" + i + ": " + String.format("%.6f", arr[N-2]) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
