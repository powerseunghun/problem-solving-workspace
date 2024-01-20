package Acmicpc.As.S5.FourThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD4158 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int n = 0, m = 0, idx1 = 0, idx2 = 0, res = 0;
		
		while(true) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			m = Integer.parseInt(str.split(" ")[1]);
			if (n == 0 && m == 0) break;
			
			arr1 = new int[n];
			arr2 = new int[m];
			
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = Integer.parseInt(br.readLine());
			}
			
			idx1 = 0;
			idx2 = 0;
			res = 0;
			
			while(idx1 < arr1.length && idx2 < arr2.length) {
				if (arr1[idx1] == arr2[idx2]) {
					res++;
					idx1++;
					idx2++;
				}
				else if (arr1[idx1] > arr2[idx2]) {
					idx2++;
				}
				else if (arr1[idx1] < arr2[idx2]) {
					idx1++;
				}
			}
			sb.append(res).append("\n");		
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
