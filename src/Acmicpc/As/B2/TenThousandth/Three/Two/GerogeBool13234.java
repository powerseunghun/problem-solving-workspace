package Acmicpc.As.B2.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GerogeBool13234 {
	static int[] arr = new int[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), op = null;
		
		for (int i = 0; i < str.split(" ").length; i++) {
			if (i == 1) {
				op = str.split(" ")[i];
			} else {
				if (str.split(" ")[i].equals("true")) {
					arr[0]++;
				} else {
					arr[1]++;
				}
			}
		}
		if (op.equals("AND")) {
			System.out.println(arr[0] > 1 ? "true" : "false");
		} else {
			System.out.println(arr[1] > 1 ? "false" : "true");
		}
		br.close();
		
	}
}
