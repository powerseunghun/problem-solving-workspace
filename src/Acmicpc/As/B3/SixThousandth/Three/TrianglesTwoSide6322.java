package Acmicpc.As.B3.SixThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrianglesTwoSide6322 {
	static double[] arr = new double[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		char c = ' ';
		int idx = 1;
		
		while (true) {
			tmp = br.readLine();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Double.parseDouble(tmp.split(" ")[i]);
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			sb.append("Triangle #" + (idx++) + "\n");
			
			if (arr[0] == -1) {
				c = 'a';
				arr[0] = Math.sqrt((arr[2]*arr[2] - arr[1]*arr[1]));
				sb.append(arr[2] <= arr[1] ? "Impossible." : String.format(c + " = %.3f", arr[0])); 
			}
			else if (arr[1] == -1) {
				c = 'b';
				arr[1] = Math.sqrt((arr[2]*arr[2] - arr[0]*arr[0]));
				sb.append(arr[2] <= arr[0] ? "Impossible." : String.format(c + " = %.3f", arr[1])); 
				
			}
			else {
				c = 'c';
				arr[2] = Math.sqrt((arr[0]*arr[0] + arr[1]*arr[1]));
				sb.append(String.format(c + " = %.3f", arr[2])); 
			}
			sb.append("\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
