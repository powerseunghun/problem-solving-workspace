package Acmicpc.As.B3.TenThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangYongClock12840 {
	static int[] arr = new int[3];
	static void calc(int T, int c) {
		arr[2] += T == 1 ? c : c*-1;
		if (T == 1) {
			for (int i = 1; i >= 0; i--) {
				arr[i] += (arr[i+1]/60);
				arr[i+1] %= 60;
			}
			arr[0] %= 24;
		}
		else {
			for (int i = 2, n = 0; i >= 1; i--) {
				if (arr[i] >= 0) continue;
				n = Math.abs(arr[i]);
				n = n%60 == 0 ? n/60 : n/60+1;
				arr[i] += 60*n;
				arr[i-1] -= n;
			}
			arr[0] = arr[0] < 0 ? 24-(Math.abs(arr[0])%24) : arr[0];
		}
	}
	static void print() {
		for (int el : arr) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tmp.split(" ")[i]);
		}
		int q = Integer.parseInt(br.readLine()), T = 0, c = 0;
		
		while (q-- > 0) {
			tmp = br.readLine();
			T = Integer.parseInt(tmp.split(" ")[0]);
			
			switch(T) {
			case 1: case 2:
				c = Integer.parseInt(tmp.split(" ")[1]);
				calc(T, c);
				break;
			case 3:
				print();
				break;
			}
		}
		
		br.close();
	}
}
