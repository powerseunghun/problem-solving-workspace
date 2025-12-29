package Acmicpc.As.B4.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shuttle34946 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int C = Integer.parseInt(str.split(" ")[2]);
		int D = Integer.parseInt(str.split(" ")[3]);
		
		if (A+B <= D && C <= D) {
			System.out.println("~.~");
		} else if (A+B > D && C > D) {
			System.out.println("T.T");
		} else {
			if (A+B <= D && C > D) {
				System.out.println("Shuttle");
			} else if (A+B > D && C <= D) {
				System.out.println("Walk");
			}
		}
		
		br.close();
	}
}
