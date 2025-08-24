package Acmicpc.As.B3.ThirtyThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParkingPay33753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int C = Integer.parseInt(str.split(" ")[2]);
		int T = Integer.parseInt(br.readLine()) - 30;
		int res = A;
		
		while(T > 0) {
			T -= B;
			res += C;
		}
		
		System.out.println(res);
		br.close();
	}
}
