package Acmicpc.As.B2.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SCSCDongariBang34814 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), max = Integer.MIN_VALUE, l = 0, h = 0;
		arr = new int[N];
		
		str = br.readLine();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
			max = Math.max(arr[i], max);
		}
		
		while(M-- > 0) {
			str = br.readLine();
			l = Integer.parseInt(str.split(" ")[0])-1;
			h = Integer.parseInt(str.split(" ")[1])-1;
			if (arr[h] == max) {
				continue;
			}
			arr[l]--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
