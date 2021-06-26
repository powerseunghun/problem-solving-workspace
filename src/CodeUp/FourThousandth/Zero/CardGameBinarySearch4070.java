package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGameBinarySearch4070 {
	static int bSearch(int l, int r, int value, int[] lis) {
		int mid = 0;
		while (l < r) {
			mid = (l+r) / 2;
			if (lis[mid] < value) {
				l = mid + 1;
			}
			else r = mid;
		}
		return r;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// n^2 time limit -> use binary search (n log n)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), idx = 0;
		int[] arr = new int[n], lis = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		lis[0] = arr[0];
		
		for (int i = 1; i < n; i++) {
			if (lis[idx] < arr[i]) {
				lis[idx+1] = arr[i];
				idx++;
			}
			else {
				lis[bSearch(0, idx, arr[i], lis)] = arr[i];
			}
		}
		System.out.println(n-(idx+1));
	}
}
