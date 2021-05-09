package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeReturnFunction1548 {
	static char grade(int n) {
		char g = ' ';
		if (n >= 90) g = 'A';
		else if (n >= 80) g = 'B';
		else if (n >= 70) g = 'C';
		else if (n >= 60) g = 'D';
		else g = 'F';
		
		return g;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(grade(Integer.parseInt(br.readLine())));
	}
}
