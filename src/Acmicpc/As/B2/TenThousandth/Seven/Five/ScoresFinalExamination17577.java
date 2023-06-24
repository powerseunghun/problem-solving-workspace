package Acmicpc.As.B2.TenThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ScoresFinalExamination17577 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0, m = 0, max = 0;
		String str = null;
		StringTokenizer st = null;
		
		while (true) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			m = Integer.parseInt(str.split(" ")[1]);
			if (n == 0 && m == 0) break;
			
			arr = new int[n];
			max = Integer.MIN_VALUE;
			while(m-- > 0) {
				st = new StringTokenizer(br.readLine());
				
				for (int i = 0; i < arr.length; i++) {
					arr[i] += Integer.parseInt(st.nextToken());
					max = Math.max(max, arr[i]);
				}
			}
			sb.append(max).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
