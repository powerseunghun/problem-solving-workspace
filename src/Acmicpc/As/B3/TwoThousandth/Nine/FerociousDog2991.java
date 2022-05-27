package Acmicpc.As.B3.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FerociousDog2991 {
	static int[] arr = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int A = 0, B = 0, C = 0, D = 0, count = 0;
		A = Integer.parseInt(tmp.split(" ")[0]);
		B = Integer.parseInt(tmp.split(" ")[1]);
		C = Integer.parseInt(tmp.split(" ")[2]);
		D = Integer.parseInt(tmp.split(" ")[3]);
		
		tmp = br.readLine();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tmp.split(" ")[i]);
		}
		
		for (int i = 0, dog1 = 0, dog2 = 0; i < arr.length; i++) {
			count = 0;
			dog1 = arr[i] % (A+B);
			dog2 = arr[i] % (C+D);
			if (dog1 != 0 && dog1 <= A) count++;
			if (dog2 != 0 && dog2 <= C) count++;
			sb.append(count + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
