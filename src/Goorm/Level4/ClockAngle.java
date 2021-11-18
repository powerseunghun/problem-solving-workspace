package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClockAngle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int H = Integer.parseInt(tmp.split(":")[0]);
		int M = Integer.parseInt(tmp.split(":")[1]);
		double angle1 = (H*30) + (M*0.5);
		double angle2 = M * 6;
		double res = Math.max(angle1, angle2) - Math.min(angle1, angle2);
		
		System.out.printf("%.2f\n", res > 180 ? 360 - res : res);
	}
}
