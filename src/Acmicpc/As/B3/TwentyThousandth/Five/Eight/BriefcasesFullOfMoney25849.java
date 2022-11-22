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
		int max = Integer.MIN_VALUE, w = 0, maxCnt = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = idx[i] * Integer.parseInt(tmp.split(" ")[i]);
			cnts[i] = Integer.parseInt(tmp.split(" ")[i]);
			System.out.println("arr[i] : " + arr[i] + ", cnts[i] : " + cnts[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max && cnts[i] < maxCnt) {
				max = arr[i];
				maxCnt = cnts[i];
				w = i;
			}
		}
		
		System.out.println(idx[w]);
		br.close();
	}
}
