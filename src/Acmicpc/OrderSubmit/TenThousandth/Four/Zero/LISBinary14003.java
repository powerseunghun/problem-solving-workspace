package Acmicpc.OrderSubmit.TenThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LISBinary14003 {
	static int getIndexBinarySearch(int left, int right, int val, int[] lisArray) {
		int mid = 0; 
		while (left < right) {
			mid = (left+right)/2;
			if (lisArray[mid] < val) {
				left = mid+1;
			}
			else right = mid;
		}
		return right;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N], lisArray = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 0) {
				lisArray[idx++] = arr[i];
			}
			else {
				if (lisArray[idx-1] < arr[i]) {
					lisArray[idx++] = arr[i];
				}
				else lisArray[getIndexBinarySearch(0, idx-1, arr[i], lisArray)] = arr[i];
			}
		}
		for (int i = 0; i < idx; i++) {
			sb.append(lisArray[i] + " ");
		}
		System.out.println(idx);
		System.out.println(sb.toString());
		br.close();
	}
}
