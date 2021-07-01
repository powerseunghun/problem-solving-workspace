package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineUpBinarySearch4474 {
	static int getBinarySerachIdx(int l, int r, int value, int[] lis) {
		int mid = 0;
		while (l < r) {
			mid = (l+r) / 2;
			if (lis[mid] < value) l = mid+1;
			else r = mid;
		}
		return r;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), idx = 0;
		int[] arr = new int[n], lis = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		lis[0] = arr[0];
		
		for (int i = 1; i < n; i++) {
			if (lis[idx] < arr[i]) {
				lis[idx+1] = arr[i];
				idx++;
			}
			else lis[getBinarySerachIdx(0, idx, arr[i], lis)] = arr[i];
		}
		System.out.println(n-(idx+1));
	}
}
