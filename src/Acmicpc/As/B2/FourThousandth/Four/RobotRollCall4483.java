package Acmicpc.As.B2.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotRollCall4483 {
	static String[] ds = null;
	static boolean[] check = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), T = 0, tc = 1;
		String str = null;
		
		while(N-- > 0) {
			sb.append("Test set ").append(tc++).append(":\n");
			T = Integer.parseInt(br.readLine());
			ds = new String[T];
			check = new boolean[T];
			for (int i = 0; i < ds.length; i++) {
				ds[i] = br.readLine();
			}
			T = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < T; i++) {
				str = br.readLine();
				for (int j = 0; j < str.split(" ").length; j++) {
					for (int k = 0; k < ds.length; k++) {
						if (ds[k].equals(str.split(" ")[j])) {
							check[k] = true;
						}
					}
				}
			}
			for (int i = 0; i < check.length; i++) {
				sb.append(ds[i]).append(" is ").append(check[i] ? "present" : "absent").append("\n");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
