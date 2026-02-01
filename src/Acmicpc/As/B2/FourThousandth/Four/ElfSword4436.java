package Acmicpc.As.B2.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElfSword4436 {
	static final int target = 10;
	static boolean[] arr = null;
	static int getCount(boolean[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]) {
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		long N = 0, T = 0;
		
		while ((tmp = br.readLine()) != null) {
			N = Integer.parseInt(tmp);
			arr = new boolean[10];
			Arrays.fill(arr, false);
			for (int k = 1; ; k++) {
				T = N * k;
				
				while(T != 0) {
					arr[(int) (T%10)] = true;
					T /= 10;
				}
				
				if (getCount(arr) == target) {
					sb.append(k).append("\n");
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
