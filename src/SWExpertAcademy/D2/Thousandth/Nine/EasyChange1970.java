package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EasyChange1970 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] change = new int[8];
		
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			Arrays.fill(change, 0);
			N = Integer.parseInt(br.readLine());
			for (int j = 0; j < money.length; j++) {
				change[j] = N / money[j];
				N -= money[j] * change[j];
			}
			sb.append("#" + i + "\n");
			for (int el : change) {
				sb.append(el + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
