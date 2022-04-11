package Codeforce.OrderSubmit.Hundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheatreSquare {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long n = Long.parseLong(tmp.split(" ")[0]);
		long m = Long.parseLong(tmp.split(" ")[1]);
		long a = Long.parseLong(tmp.split(" ")[2]);
		
		System.out.println((long)(Math.ceil((double)n/a) * Math.ceil((double)m/a)));
		br.close();
	}
}
