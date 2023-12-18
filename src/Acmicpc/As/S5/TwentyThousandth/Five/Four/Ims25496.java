package Acmicpc.As.S5.TwentyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ims25496 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(str.split(" ")[0]);
		int N = Integer.parseInt(str.split(" ")[1]), v = 0, res = 0;
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		while (v < N && P < 200) {
			res++;
			P += arr[v];
			v++;
		}
		
		System.out.println(res);
		
	}
}
