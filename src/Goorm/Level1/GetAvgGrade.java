package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetAvgGrade {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input = new StringTokenizer(br.readLine());
		
		int sum = 0;
		double avg = 0;
		char grade = ' ';
		
		while (input.hasMoreTokens()) {
			sum += Integer.parseInt(input.nextToken());
		}
		avg = sum / 3.0;
		
		if (avg >= 90) grade = 'A';
		else if (avg >= 80) grade = 'B';
		else if (avg >= 70) grade = 'C';
		else if (avg >= 60) grade = 'D';
		else grade = 'F';
		
		System.out.printf("%.2f %c", avg, grade);
	}
}
