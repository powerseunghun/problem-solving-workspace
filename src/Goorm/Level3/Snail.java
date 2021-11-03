package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Snail {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		boolean flag = true;
		double H = Double.parseDouble(tmp.split(" ")[0]);
		double U = Double.parseDouble(tmp.split(" ")[1]);
		double D = Double.parseDouble(tmp.split(" ")[2]);
		double F = Double.parseDouble(tmp.split(" ")[3]);
		double dist = 0;
		int day = 0;
		
		while (true) {
			day++;
			dist += U;
			if ((int)dist > H) break;
			dist -= D;
			U -= (U * F / 100);
			if (U < 0) {
				flag = false;
				break;
			}
		}
		if (!flag) {
			while (dist > 0) {
				dist += U;
				U -= (U * F / 100);
				day++;
			}
			System.out.println("Failure " + day);
		}
		else System.out.println("Success " + day);
		
		br.close();
	}
}
