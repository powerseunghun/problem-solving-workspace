package SWExpertAcademy.D3.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoBulb12741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0, C = 0, D = 0, cnt = 0;
		int[] arr1 = new int[101], arr2 = new int[101];
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			Arrays.fill(arr1, 0);
			Arrays.fill(arr2, 0);
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			D = Integer.parseInt(tmp.split(" ")[3]);
			cnt = 0;
			for (int j = A; j <= B; j++) {
				arr1[j] = 1;
			}
			for (int j = C; j <= D; j++) {
				arr2[j] = 1;
			}
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == 1 && arr2[j] == 1) cnt++;
			}
			sb.append("#" + i + " " + (cnt != 0 ? cnt-1 : cnt) + "\n");
		}
		System.out.print(sb.toString());
	}
}
