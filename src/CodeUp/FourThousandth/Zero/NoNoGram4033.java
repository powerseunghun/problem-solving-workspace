package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NoNoGram4033 {
	static int count = 0;
	static int[] arr = new int[21];
	static void bt(int total, int idx, boolean blankCheck, int n, int k) {
		if (total > n || idx > k) return;
		
		if (total == n && idx == k) {
			count++;
			return;
		}
		
		if (!blankCheck) bt(total+arr[idx], idx+1, true, n, k);
		bt(total+1, idx, false, n, k);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		bt(0, 0, false, n, k);
		
		System.out.println(count);
	}
}
