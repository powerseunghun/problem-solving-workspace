package SWExpertAcademy.D3.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek5515 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), m = 0, d = 0, sum = 0;
		int[] arr = {4, 5, 6, 0, 1, 2, 3};
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			sum = 0;
			m = Integer.parseInt(tmp.split(" ")[0]);
			d = Integer.parseInt(tmp.split(" ")[1]);
			for (int j = 1; j < m; j++) {
				switch(j) {
				case 2:
					sum += 29;
					break;
				case 4: case 6: case 9: case 11:
					sum += 30;
					break;
				default:
					sum += 31;
					break;
				}
			}
			sum += d-1;
			sb.append("#" + i + " " + arr[sum%7] + "\n");
		}
		System.out.print(sb.toString());
	}
}
