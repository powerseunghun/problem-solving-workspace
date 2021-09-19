package SWExpertAcademy.D3.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PartSequenceSum2817 {
	static int[] ns = null;
	static int[] arr = null;
	static int count = 0;
	static void search(int N, int d, int K, int sum, int idx) {
		if (d >= N) return;
		if (sum > K) return;
		
		if (d >= 0 && sum == K) {
			count++;
			return;
		}
		
		for (int i = idx; i < ns.length; i++) {
			arr[d] = ns[i];
			search(N, d+1, K, (sum+ns[i]), i+1);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);             
			K = Integer.parseInt(tmp.split(" ")[1]);             
			count = 0;
			ns = new int[N];
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				ns[j] = Integer.parseInt(st.nextToken());
			}
			search(N, 0, K, 0, 0);
			sb.append("#" + i + " " + count + "\n");
		}
		System.out.print(sb.toString());
	}
}
