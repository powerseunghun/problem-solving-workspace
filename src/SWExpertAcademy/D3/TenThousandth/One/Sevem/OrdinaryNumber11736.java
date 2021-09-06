package SWExpertAcademy.D3.TenThousandth.One.Sevem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OrdinaryNumber11736 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, max = 0, min = 0, cnt = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			cnt = 0;
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0, a = 0, b = 0, c = 0; j < N-2; j++) {
				max = Integer.MIN_VALUE;
				min = Integer.MAX_VALUE;
				a = arr[j];
				b = arr[j+1];
				c = arr[j+2];
				max = Math.max(a, Math.max(b, c));
				min = Math.min(a, Math.min(b, c));
				if (b != max && b != min) cnt++;
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
