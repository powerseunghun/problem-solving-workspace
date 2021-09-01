package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GradeCalculator1983 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0, base = 0, idx = 0;
		int[][] arr = null;
		double[] grade = null, cGrade = null;
		String[] alpha = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			base = N/10;
			idx = 0;
			arr = new int[N][3];
			grade = new double[N];
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				for (int k = 0; k < 3; k++) {
					arr[j][k] = Integer.parseInt(tmp.split(" ")[k]);
				}
			}
			for (int j = 0; j < N; j++) {
				grade[j] = (arr[j][0] * 0.35) + (arr[j][1] * 0.45) + (arr[j][2] * 0.20);
			}
			cGrade = grade.clone();
			Arrays.sort(cGrade);
			
			for (int j = cGrade.length-1, count = 0; j >= 0; j--) {
				if(cGrade[j] == grade[K-1]) {
					sb.append("#" + i + " " + alpha[idx] + "\n");
					break;
				}
				count++;
				if (count == base) {
					idx++;
					count = 0;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
