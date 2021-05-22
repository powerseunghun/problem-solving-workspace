package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LowerBound2633 {
	static int lowerBound(int[] arr, int k) {
		int s = 0, e = arr.length-1, mid = 0;
		while(e > s) {
			mid = (s + e) / 2;
			if (arr[mid] >= k) e = mid;
			else s = mid + 1;
		}
		if (arr[e] < k) return -1;
		return e+1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if (lowerBound(arr, k) < 0) System.out.println(n+1);
		else System.out.println(lowerBound(arr, k));
	}
}
