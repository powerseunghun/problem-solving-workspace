package Acmicpc.As.B3.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FencePainting11970 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[101];
		String tmp = null;
		boolean flag = false;
		int cnt = 0;
		
		for (int i = 0, x = 0, y = 0; i < 2; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			for (int j = x; j <= y; j++) {
				arr[j]++;
			}
		}
		for (int el : arr) {
			if (el != 0) {
				if (el > 1) flag = true;
				cnt++;
			}
		}
		
		
		System.out.println(flag ? cnt-1 : cnt-2);
		br.close();
	}
}
