package Acmicpc.OrderSubmit.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveGrade10984 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, C = 0, totalC = 0;
		double G = 0, sum = 0;
		String tmp = null;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			sum = 0;
			totalC = 0;
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				C = Integer.parseInt(tmp.split("")[0]);
				G = Double.parseDouble(tmp.split(" ")[1]);
				totalC += C;
				sum += (C*G);
			}
			sb.append(totalC + " " + String.format("%.2f\n", sum/totalC));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
