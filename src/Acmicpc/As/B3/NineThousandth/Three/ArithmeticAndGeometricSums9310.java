package Acmicpc.As.B3.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArithmeticAndGeometricSums9310 {
	static int[] arr = null;
	static int check() {
		if ((arr[2] - arr[1]) == (arr[1] - arr[0])) return 0;
		else return 1;
	}
	static int getSum(int check, int N) {
		if (check == 0) return (N * (2 * arr[0] + (N-1) * (arr[1]-arr[0])))/2;
		else return (int)((Math.pow(arr[1]/arr[0], N) -1) / (arr[1]/arr[0]-1) * arr[0]);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 0, flag = 0;
		StringTokenizer st = null;
		
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			st = new StringTokenizer(br.readLine());
			arr = new int[3];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			flag = check();
			sb.append(getSum(flag, N) + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
