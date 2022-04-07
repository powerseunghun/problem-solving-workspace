package Acmicpc.OrderSubmit.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CASIO15963 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		if (tmp.split(" ")[0].equals(tmp.split(" ")[1])) {
			System.out.println("1");
		}
		else System.out.println("0");
		
		br.close();
	}
}
