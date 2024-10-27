package Acmicpc.As.B4.ThirtyThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataType32278 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		
		if (Short.MIN_VALUE <= N && N <= Short.MAX_VALUE) {
			System.out.println("short");
		} else if (Integer.MIN_VALUE <= N && N <= Integer.MAX_VALUE) {
			System.out.println("int");
		} else {
			System.out.println("long long");
		}
		br.close();
	}
}
