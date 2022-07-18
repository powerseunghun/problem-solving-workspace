package Acmicpc.As.B3.NineThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangementOfContest9443 {
	static int[] arr = new int[26];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0, max = 0;
		for (int i = 0; i < N; i++) {
			arr[br.readLine().charAt(0)-65]++;
		}
		
		for (int el : arr) {
			if (el >= 1) {
				cnt++;
				continue;
			}
			max = Math.max(max, cnt);
			cnt = 0;
			break;
		}

		System.out.println(max);
		br.close();
	}
}
