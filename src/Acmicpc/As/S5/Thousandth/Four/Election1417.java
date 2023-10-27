package Acmicpc.As.S5.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Election1417 {
	static int[] arr = null;
	static int getMaxIdx() {
		int idx = Integer.MAX_VALUE, max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				idx = i;
				max = arr[i];
			}
		}
		return idx;
	}
	static void func(int idx) {
		arr[0]++;
		arr[idx]--;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), idx = 0, res = 0;
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		while(true) {
			idx = getMaxIdx();
			if (idx != 0) {
				func(idx);
				res++;
				continue;
			}
			break;
		}
		System.out.println(res);
		br.close();
	}
}
