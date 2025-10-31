package Acmicpc.As.B3.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HardRocksAndAtomicClocks34384 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		System.out.println((3659-x%3600) / 60);
		br.close();
	}
}
