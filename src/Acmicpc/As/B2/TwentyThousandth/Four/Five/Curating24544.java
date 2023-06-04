package Acmicpc.As.B2.TwentyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Curating24544 {
	static int[] arr = null, check = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), t = 0, res = 0;
		StringTokenizer st = null;

		arr = new int[N];
		check = new int[N];
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				if (i == 0) {
					arr[j] = Integer.parseInt(st.nextToken());
					t += arr[j];
					continue;
				}
				check[j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < check.length; i++) {
			res += check[i] == 1 ? 0 : arr[i];
		}
		
		System.out.println(t);
		System.out.println(res);
		br.close();
	}
}
