package Acmicpc.As.B3.TwentyThousandth.Six.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsolutelyFlat26863 {
	static int[] arr = new int[4];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.MAX_VALUE, minIdx = 0, ex = 0, res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] < min) {
				min = arr[i];
				minIdx = i;
			}
		}
		ex = Integer.parseInt(br.readLine());
		
		if ((arr[0] == arr[1]) && (arr[1] == arr[2]) && (arr[2] == arr[3])) {
			res = 1;
		}
		else {
			arr[minIdx] += ex;
			if ((arr[0] == arr[1]) && (arr[1] == arr[2]) && (arr[2] == arr[3])) {
				res = 1;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
