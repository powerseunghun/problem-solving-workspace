package SWExpertAcademy.D3.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialPrime4698 {
	static int[] arr = null;
	static int cnt = 0;
	static void init() {
		cnt = 0;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = 2*i; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), D = 0, A = 0, B = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			D = Integer.parseInt(tmp.split(" ")[0]);
			A = Integer.parseInt(tmp.split(" ")[1]);
			B = Integer.parseInt(tmp.split(" ")[2]);
			arr = new int[B+1];
			init();
			for (int j = A; j <= B; j++) {
				if (arr[j] != 0 && (j+"").contains(D+"")) {
					cnt++;
				}
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
