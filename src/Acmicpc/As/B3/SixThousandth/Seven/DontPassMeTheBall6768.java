package Acmicpc.As.B3.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DontPassMeTheBall6768 {
	static int get(int J) {
		int tmp1 = (J-3)*(J-2)*(J-1);
		int tmp2 = 3*2*1;
		
		return tmp1/tmp2;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int J = Integer.parseInt(br.readLine());
		
		System.out.println(get(J));
		br.close();
	}
}
