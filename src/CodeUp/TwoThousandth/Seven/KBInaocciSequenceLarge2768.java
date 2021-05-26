package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KBInaocciSequenceLarge2768 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int k = Integer.parseInt(tmp.split(" ")[0]);
		int n = Integer.parseInt(tmp.split(" ")[1]);
		long sum = 0;
		int[] arr = new int[n+1];
		Arrays.fill(arr, 0);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1, val = 0; i <= k; i++) {
			val = Integer.parseInt(st.nextToken());
			if (i != k) sum += val;
			arr[i] = val;
		}
		arr[0] = (int) (arr[k] - sum);
		
		for (int i = k+1; i <= n; i++) {
			arr[i] = (arr[i-1] - arr[i-k-1] + arr[i-1] + 100007) % 100007;
		}
		
		System.out.println(arr[n]);
		
	}
}
