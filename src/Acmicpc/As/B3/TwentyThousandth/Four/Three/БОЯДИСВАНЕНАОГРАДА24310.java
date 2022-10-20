package Acmicpc.As.B3.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class БОЯДИСВАНЕНАОГРАДА24310 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long A = Long.parseLong(tmp.split(" ")[0]);
		long B = Long.parseLong(tmp.split(" ")[1]);
		long C = Long.parseLong(tmp.split(" ")[2]);
		long D = Long.parseLong(tmp.split(" ")[3]);
		long min = Math.min(Math.min(A, B), Math.min(C, D));
		long max = Math.max(Math.max(A, B), Math.max(C, D));
		
		System.out.println(Math.min(max-min+1, Math.abs(A-B)+Math.abs(C-D)+2));
		br.close();
	}
}
