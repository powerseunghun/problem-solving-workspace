package Acmicpc.As.B5.TenThousandth.Eight.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rats18301 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double n1 = Double.parseDouble(tmp.split(" ")[0])+1;
		double n2 = Double.parseDouble(tmp.split(" ")[1])+1;
		double n12 = Double.parseDouble(tmp.split(" ")[2])+1;
		int res = (int)((n1*n2)/n12) - 1;
		
		System.out.println(res);
		br.close();
	}
}
