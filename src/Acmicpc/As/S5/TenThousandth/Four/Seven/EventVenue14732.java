package Acmicpc.As.S5.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EventVenue14732 {
	static final int limit = 500;
	static int[][] arr = new int[limit+1][limit+1];
	static int[] nums = new int[4];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0, x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			x1 = Integer.parseInt(str.split(" ")[0]);
			y1 = Integer.parseInt(str.split(" ")[1]);
			x2 = Integer.parseInt(str.split(" ")[2]);
			y2 = Integer.parseInt(str.split(" ")[3]);
			nums[0] = Math.min(nums[0], x1);
			nums[1] = Math.min(nums[1], y1);
			nums[2] = Math.max(nums[2], x2);
			nums[3] = Math.max(nums[3], y2);
			for (int i = x1; i < x2; i++) {
				for (int j = y1; j < y2; j++) {
					arr[j][i] = 1;
				}
			}
		}
		
		for (int i = nums[0]; i < nums[2]; i++) {
			for (int j = nums[1]; j < nums[3]; j++) {
				res = arr[j][i] == 1 ? res+1 : res;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
