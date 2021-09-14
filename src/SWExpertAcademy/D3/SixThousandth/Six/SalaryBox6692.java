package SWExpertAcademy.D3.SixThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryBox6692 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		double p = 0, x = 0, sum = 0;;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			sum = 0;
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				p = Double.parseDouble(tmp.split(" ")[0]);
				x = Double.parseDouble(tmp.split(" ")[1]);
				sum += (p * x);
			}
			sb.append("#" + i + " " + String.format("%.6f\n", sum));
		}
		
		System.out.print(sb.toString());
	}
}
