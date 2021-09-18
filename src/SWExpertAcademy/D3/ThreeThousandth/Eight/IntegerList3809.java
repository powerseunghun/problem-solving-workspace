package SWExpertAcademy.D3.ThreeThousandth.Eight;

import java.io.IOException;
import java.util.Scanner;

public class IntegerList3809 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt(), N = 0;
		
		for (int i = 1; i <= T; i++) {
			String tmp = "";
			N = Integer.parseInt(sc.next());
			sb.append("#" + i + " ");
			for (int j = 0; j < N; j++) {
				tmp += sc.next();
			}
			for (int j = 0; ; j++) {
				if (!tmp.contains(j+"")) {
					sb.append(j + "\n");
					break;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
