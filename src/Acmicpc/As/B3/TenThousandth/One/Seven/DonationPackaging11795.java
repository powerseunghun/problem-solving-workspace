package Acmicpc.As.B3.TenThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DonationPackaging11795 {
	static int[] arr = new int[3];
	static boolean check() {
		if (arr[0] < 30 || arr[1] < 30 || arr[2] < 30) return false;
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), min = 0;
		String tmp = null;
		Arrays.fill(arr, 0);
		
		while(T-- > 0) {
			tmp = br.readLine();
			arr[0] += Integer.parseInt(tmp.split(" ")[0]);
			arr[1] += Integer.parseInt(tmp.split(" ")[1]);
			arr[2] += Integer.parseInt(tmp.split(" ")[2]);
			if (!check()) {
				sb.append("NO\n");
				continue;
			}
			min = Math.min(arr[0], Math.min(arr[1], arr[2]));
			sb.append(min + "\n");
			for (int i = 0; i < arr.length; i++) {
				arr[i] -= min;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
