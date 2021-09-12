package SWExpertAcademy.D3.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelfCopyString7584 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), ans = 0;
		long K = 0;
		
		for (int i = 1; i <= T; i++) {
			K = Long.parseLong(br.readLine());
			K--;
			ans = 0;
			while (K > 0) {
				K = K % 2 == 1 ? (K-1)/2 : K;
				if (K % 4 == 0) {
					ans = 0;
					break;
				}
				else if (K % 2 == 0) {
					ans = 1;
					break;
				}
			}
			sb.append("#" + i + " " + ans + "\n");
		}
		System.out.print(sb.toString());
	}
}
