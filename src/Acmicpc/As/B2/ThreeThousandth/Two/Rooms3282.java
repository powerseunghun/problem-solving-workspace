package Acmicpc.As.B2.ThreeThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rooms3282 {
	static int[] arr = null;
	static void func(int C) {
		while(C > 0) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0 && C >= 2) {
					arr[i] += 2;
					C-=2;
					flag = true;
					break;
				}
			}
			if(!flag) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == 0) {
						arr[i]++;
						C--;
						flag = true;
						break;
					}
				}
			}
			if (!flag) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < 2) {
						arr[i]++;
						C--;
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int G = Integer.parseInt(tmp.split(" ")[1]), C = 0;
		arr = new int[N];
		
		while(G-- > 0) {
			C = Integer.parseInt(br.readLine());
			func(C);
		}
		for (int el : arr) {
			sb.append(el + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
