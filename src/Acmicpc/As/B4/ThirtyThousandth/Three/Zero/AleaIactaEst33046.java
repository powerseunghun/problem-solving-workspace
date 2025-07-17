package Acmicpc.As.B4.ThirtyThousandth.Three.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AleaIactaEst33046 {
	static final int l = 4;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int sum = 0;
		
		for (int i = 0; i < l/2; i++) {
			str = br.readLine();
			sum += Integer.parseInt(str.split(" ")[0]);
			sum += Integer.parseInt(str.split(" ")[1]);
		}
		
		System.out.println((sum-l/2)%l+1);
		br.close();
	}
}
