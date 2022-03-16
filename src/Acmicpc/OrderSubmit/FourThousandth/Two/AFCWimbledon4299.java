package Acmicpc.OrderSubmit.FourThousandth.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AFCWimbledon4299 {
	static int A = 0, B = 0;
	static boolean func(int sum, int diff) {
		A = (sum + diff) / 2;
		B = sum - A;
		if (sum < diff || Math.abs(A-B) != diff) return false;
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int sum = Integer.parseInt(tmp.split(" ")[0]);
		int diff = Integer.parseInt(tmp.split(" ")[1]);
		
		if (func(sum, diff)) {
			System.out.println(Math.max(A, B) + " " + Math.min(A, B));
		}
		else System.out.println("-1");
		
		br.close();
	}
}
