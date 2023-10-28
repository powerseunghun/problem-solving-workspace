package Acmicpc.As.S5.TwentyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class YourAvg25206 {
	static String[] grds = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	static double[] sc = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
	static final double div = 20.0;
	static Map<String, Double> map = new HashMap<>();
	static void mapInit() {
		for (int i = 0; i < grds.length; i++) {
			map.put(grds[i], sc[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null, grade = null;
		double sc = 0, scSum = 0, res = 0;
		mapInit();
		
		for (int i = 0; i < div; i++) {
			str = br.readLine();
			grade = str.split(" ")[2];
			
			if (grade.equals("P")) continue;
			sc = Double.parseDouble(str.split(" ")[1]);
			scSum += sc;
			res += sc * map.get(grade);
		}
		
		System.out.println(scSum);
		System.out.println(String.format("%.6f", res / scSum));
		br.close();
	}
}
