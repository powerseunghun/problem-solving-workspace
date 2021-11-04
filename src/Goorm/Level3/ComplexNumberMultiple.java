package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComplexNumberMultiple {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int[] a = new int[2], b = new int[2];
		int resA = 0, resB = 0;
		
		for (int i = 0; i < a.length; i++) {
			tmp = br.readLine();
			a[i] = Integer.parseInt(tmp.split(" ")[0]);
			b[i] = Integer.parseInt(tmp.split(" ")[1]);
		}
		resA = (a[0] * a[1]) + (b[0] * b[1] * -1);
		resB = (a[0] * b[1]) + (b[0] * a[1]);
		
		sb.append(resA);
		
		if (resB != 0) {
			sb.append(" " + (resB < 0 ? "-" : "+") + " " + Math.abs(resB) + "i");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
