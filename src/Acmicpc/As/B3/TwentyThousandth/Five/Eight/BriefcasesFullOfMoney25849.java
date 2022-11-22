package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BriefcasesFullOfMoney25849 {
	static int[] arr = new int[6];
	static int[] cnts = new int[6];
	static int[] idx = {1, 5, 10, 20, 50, 100};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int max = Integer.MIN_VALUE, minCnt = Integer.MAX_VALUE;
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			cnts[i] = Integer.parseInt(tmp.split(" ")[i]);
			arr[i] = idx[i] * cnts[i];
			max = Math.max(arr[i], max);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				minCnt = Math.min(minCnt, cnts[i]);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max && cnts[i] == minCnt) {
				res = idx[i];
				break;
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//		if (arr[i] >= max && cnts[i] < maxCnt) {
//			max = arr[i];
//			maxCnt = cnts[i];
//			w = i;
//		}
//	}
	
//		System.out.println(idx[w]);
//		br.close();
		System.out.println(res);
		br.close();
	}
}
