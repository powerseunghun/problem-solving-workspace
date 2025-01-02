package Acmicpc.As.B3.TwentyThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FatigueFightingVacation29991 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int D = Integer.parseInt(str.split(" ")[0]);
		int C = Integer.parseInt(str.split(" ")[1]);
		int R = Integer.parseInt(str.split(" ")[2]), v = D, res = R;
		arr = new int[C];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < R; i++) {
			v += Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > v) break;
			v -= arr[i];
			res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
