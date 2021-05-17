package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForwardBackward2006 {
	static int getDistance(int f, int b, int s) {
		int walk = 0, walkDistance = 0;
		boolean wFlag = true, secondFlag = true;
		while(wFlag) {
			for (int i = 0; i < f; i++) {
				walk++;
				walkDistance++;
				if (walk % s == 0) {
					secondFlag = false;
					break;
				}
			}
			if (!secondFlag) break;
			for (int j = 0; j < b; j++) {
				walk++;
				walkDistance--;
				if (walk % s == 0) {
					wFlag = false;
					break;
				}
			}
		}
		return walkDistance;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());
		
		if (getDistance(a, b, s) > getDistance(c, d, s)) {
			System.out.println("Nikky");
		}
		else if (getDistance(a, b, s) < getDistance(c, d, s)) {
			System.out.println("Byron");
		}
		else System.out.println("Tied");
	}
}
