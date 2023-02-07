package Acmicpc.As.B2.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TruckParking2979 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]), sum = 0;
		int[] arr = new int[101];
		
		for (int i = 0, s = 0, e = 0; i < 3; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			e = Integer.parseInt(tmp.split(" ")[1]);
			for (int j = s; j < e; j++) {
				arr[j]++;
			}
		}
		for (int el : arr) {
			if (el == 0) continue;
			sum += el == 1 ? A : el == 2 ? B*el : C*el;
		}
		
		System.out.println(sum);
		br.close();
	}
}
