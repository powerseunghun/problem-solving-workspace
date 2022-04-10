package Acmicpc.OrderSubmit.TenThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HuntTheRabbit13777 {
	static StringBuilder sb = new StringBuilder();
	static void binarySearch(int target) {
		int s = 1, e = 50, mid = 0;
		while (s <= e) {
			mid = (s+e) / 2;
			sb.append(mid + " ");
			if (mid == target) {
				sb.append("\n");
				break;
			}
			if (mid > target) e = mid-1;
			else s = mid+1;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = 0;
		
		while (true) {
			target = Integer.parseInt(br.readLine());
			if (target == 0) break;
			binarySearch(target);
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
