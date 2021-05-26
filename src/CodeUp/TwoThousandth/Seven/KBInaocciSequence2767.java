package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KBInaocciSequence2767 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int k = Integer.parseInt(tmp.split(" ")[0]);
		int n = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[n+1];
		Arrays.fill(arr, 0);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = k+1; i <= n; i++) {
			for (int j = i-1; j >= i-k; j--) {
				arr[i] += arr[j];
			}
		}
		
		System.out.println(arr[n]);
		
	}
}
