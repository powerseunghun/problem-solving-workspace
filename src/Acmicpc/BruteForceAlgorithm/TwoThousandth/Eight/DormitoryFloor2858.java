package Acmicpc.BruteForceAlgorithm.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DormitoryFloor2858 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int get1 = (R+4)/2, get2 = R+B;
		
		for (int i = 1; i <= get1; i++) {
			if ((get1-i) * i == get2) {
				System.out.println(Math.max(i, get1-i) + " " + Math.min(i, get1-i));
				return;
			}
		}
		
	}
}
