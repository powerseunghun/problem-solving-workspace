package Acmicpc.As.B3.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TriangularClassification9366 {
	static int[] arr = new int[3];
	static String classify() {
		if (arr[0] == arr[1] && arr[1] == arr[2]) return "equilateral";
		else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
			if (arr[2] < arr[0]+arr[1]) return "isosceles";
			else return "invalid!";
		}
		else {
			if (arr[2] < arr[0]+arr[1]) return "scalene";
			else return "invalid!";
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(tmp.split(" ")[j]);
			}
			Arrays.sort(arr);
			sb.append("Case #" + i + ": " + classify() + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
