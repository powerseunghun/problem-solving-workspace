package Acmicpc.As.B2.TwentyThousandth.Nine.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ПойматьХалка29358 {
	static int[] arr1 = null, arr2 = null, arr3 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 0;
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr1 = new int[n];
		arr2 = new int[n];
		arr3 = new int[n];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(str.split(" ")[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			if (arr2[i] > 0 && arr3[i] > 0) res++;
			if (arr2[i] < arr1[i] && arr3[i] < arr1[i]) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
