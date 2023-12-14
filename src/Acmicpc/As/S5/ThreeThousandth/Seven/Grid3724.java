package Acmicpc.As.S5.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Grid3724 {
	static BigInteger[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, idx = 0;
		String str = null;
		BigInteger res = null;
		
		while(T-- > 0) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			arr = new BigInteger[N];
			Arrays.fill(arr, BigInteger.ONE);
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < arr.length; j++) {
					arr[j] = arr[j].multiply(new BigInteger(st.nextToken()));
				}
			}
			idx = 0;
			res = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (res.compareTo(arr[i]) <= 0) {
					res = arr[i];
					idx = i;
				}
			}
			sb.append(idx+1).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
