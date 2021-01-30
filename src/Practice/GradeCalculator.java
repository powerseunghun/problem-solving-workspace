package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GradeCalculator {
	public void mapInit(Map<String, Double> grades) {
		grades.put("A+", 4.3); grades.put("A0", 4.0); grades.put("A-", 3.7);
		grades.put("B+", 3.3); grades.put("B0", 3.0); grades.put("B-", 2.7);
		grades.put("C+", 2.3); grades.put("C0", 2.0); grades.put("C-", 1.7);
		grades.put("D+", 1.3); grades.put("D0", 1.0); grades.put("D-", 0.7);
		grades.put("F", 0.0); grades.put("Pass", 4.3); grades.put("Fail", 0.0);
	}
	
	public String getGrades(double sum) {
		String grade = "";
		if (sum >= 4.3) {
			grade = "A+";
		}
		else if (sum >= 4.0) {
			grade = "A0";
		}
		else if (sum >= 3.7) {
			grade = "A-";
		}
		else if (sum >= 3.3) {
			grade = "B+";
		}
		else if (sum >= 3.0) {
			grade = "B0";
		}
		else if (sum >= 2.7) {
			grade = "B-";
		}
		else if (sum >= 2.3) {
			grade = "C+";
		}
		else if (sum >= 2.0) {
			grade = "C0";
		}
		else if (sum >= 1.7) {
			grade = "C-";
		}
		else if (sum >= 1.3) {
			grade = "D+";
		}
		else if (sum >= 1.0) {
			grade = "D0";
		}
		else if (sum >= 0.7) {
			grade = "D-";
		}
		else {
			grade = "F";
		}
		return grade;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Double> grades = new HashMap<>();
		List<String> retakeNeeded = new ArrayList<>();
		GradeCalculator gc = new GradeCalculator();
		gc.mapInit(grades);
		
		int n = sc.nextInt();
		String s = "", g = "";
		double sum = 0.0, a = 0.0, sum2 = 0.0;
		for (int i = 0; i < n; i++) {
			s = sc.next(); g = sc.next(); a = sc.nextDouble();
			sum += (grades.get(g) * a);
			sum2 += a;
			if (grades.get(g) <= grades.get("C+")) {
				retakeNeeded.add(s + " (" + g + ")");
			}
		}
		
		System.out.printf("Average : %.2f (%s)\n\n", (sum / sum2), gc.getGrades(sum / sum2));
		System.out.println("RETAKE NEEDED (" + retakeNeeded.size() + ")");
		for (int i = 0; i < retakeNeeded.size(); i++) {
			System.out.println(" " + retakeNeeded.get(i));
		}
	}
}
