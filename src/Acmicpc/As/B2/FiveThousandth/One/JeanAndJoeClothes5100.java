package Acmicpc.As.B2.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JeanAndJoeClothes5100 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 0, w = 0;
		String tmp = null;
		boolean flag = false;
		
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			arr = new int[5];
			while(N-- > 0) {
				flag = false;
				tmp = br.readLine();
				if (tmp.matches("^[A-Z]")) {
					if (tmp.charAt(0) == 'M' || tmp.charAt(0) == 'L') {
						flag = true;
						arr[0]++;
					}
					else if (tmp.charAt(0) == 'S') {
						flag = true;
						arr[3]++;
					}
				}
				else {
					w = Integer.parseInt(tmp);
					if (w >= 12) {
						flag = true;
						arr[1]++;
					}
					else if (w < 12) {
						flag = true;
						arr[2]++;
					}
				}
				if (!flag) {
					arr[4]++;
				}
			}
			for (int el : arr) {
				sb.append(el).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
