package Acmicpc.As.B3.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GeneralElection16175 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0, max = 0;
		StringBuilder sb = new StringBuilder(); 
		StringTokenizer st = null;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N];
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					arr[j] += Integer.parseInt(st.nextToken());
				}
			}
			max = Integer.MIN_VALUE;
			for (int el : arr) {
				max = Math.max(el, max);
			}
			
			for (int i = 0; i < arr.length; i++) {
				if (max == arr[i]) {
					sb.append((i+1) + "\n");
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
