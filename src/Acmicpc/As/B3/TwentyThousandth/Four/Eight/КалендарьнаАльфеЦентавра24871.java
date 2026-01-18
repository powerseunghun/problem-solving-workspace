package Acmicpc.As.B3.TwentyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class КалендарьнаАльфеЦентавра24871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long d = Long.parseLong(str.split(" ")[0]);
		long m = Long.parseLong(str.split(" ")[1]);
		long w = Long.parseLong(str.split(" ")[2]);
		str = br.readLine();
		long i = Long.parseLong(str.split(" ")[0])-1;
		long j = Long.parseLong(str.split(" ")[1])-1;
		long k = Long.parseLong(str.split(" ")[2])-1;
		char res = (char)('a' + (d*m*k+d*j+i) % w);
		
		System.out.println(res);
		br.close();
	}
}
