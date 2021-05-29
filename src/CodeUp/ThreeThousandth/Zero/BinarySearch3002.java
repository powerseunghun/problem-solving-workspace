package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch3002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = 0, q = 0, left = 0, mid = 0, right = 0;
		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			q = Integer.parseInt(st.nextToken());
			left = 0;
			right = list.length - 1;
			while(left <= right) {
				mid = (left + right) / 2;
				
				if (list[mid] == q) {
					System.out.print((mid + 1) + " ");
					break;
				}
				else if (list[mid] > q) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
				if (!(left <= right)) {
					System.out.print("-1 ");
				}
			}
		}
	}
}
