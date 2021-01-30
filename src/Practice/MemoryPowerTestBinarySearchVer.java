package Practice;

import java.util.Scanner;

public class MemoryPowerTestBinarySearchVer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = 0, q = 0, left = 0, mid = 0, right = 0;
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		m = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			q = sc.nextInt();
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
