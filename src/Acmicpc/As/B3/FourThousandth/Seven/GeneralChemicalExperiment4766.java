package Acmicpc.As.B3.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneralChemicalExperiment4766 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double beforeTemp = 0, temp = 0;
		boolean flag = false;
		
		while (true) {
			temp = Double.parseDouble(br.readLine());
			if (temp == 999) break;
			if (flag) {
				sb.append(String.format("%.2f\n", temp-beforeTemp));
			}
			beforeTemp = temp;
			flag = true;
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
