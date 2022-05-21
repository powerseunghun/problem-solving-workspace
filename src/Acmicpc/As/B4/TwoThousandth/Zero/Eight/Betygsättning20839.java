package Acmicpc.As.B4.TwoThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Betygsättning20839 {
	static double[] arr1 = new double[3];
	static double[] arr2 = new double[3];
	static char getGrade() {
		if (arr2[0] >= arr1[0] && arr2[1] >= arr1[1] && arr2[2] >= arr1[2]) {
			return 'A';
		}
		else if (arr2[2] >= arr1[2] && arr2[1] >= arr1[1]) {
			if (arr2[0] >= arr1[0]/2) {
				return 'B';
			}
			else return 'C';
		}
		else if (arr2[2] >= arr1[2]) {
			if (arr2[1] >= arr1[1]/2) {
				return 'D';
			}
			else return 'E';
		}
		return 'E';
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr1.length; j++) {
				if (i == 0) arr1[j] = Double.parseDouble(st.nextToken());
				else arr2[j] = Double.parseDouble(st.nextToken());
			}
		}
		
		System.out.println(getGrade());
		br.close();
	}
}
