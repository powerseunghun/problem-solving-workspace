package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YearExpression4776 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), id1 = 0, id2 = 0;
		String str1 = "ABCDEFGHIJKL";
		String str2 = "0123456789";
		
		switch(N) {
		case 1:
			System.out.println("J7");
			return;
		case 2:
			System.out.println("K8");
			return;
		case 3:
			System.out.println();
			return;
		default:
			for (int i = 4; i < N; i++) {
				id1 = (id1+1) % 12;
				id2 = (id2+1) % 10;
			}
			System.out.print(str1.charAt(id1));
			System.out.println(str2.charAt(id2));
			return;
		}
	}
}
