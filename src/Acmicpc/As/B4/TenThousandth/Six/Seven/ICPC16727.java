package Acmicpc.As.B4.TenThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ICPC16727 {
	static int[] arr = new int[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		for (int i = 0, idx = 0; i < 2; i++) {
			tmp = br.readLine();
			arr[idx++] = Integer.parseInt(tmp.split(" ")[0]);
			arr[idx++] = Integer.parseInt(tmp.split(" ")[1]);
		}
		
		if (arr[0]+arr[3] > arr[1]+arr[2]) System.out.println("Persepolis");
		else if (arr[0]+arr[3] < arr[1]+arr[2]) System.out.println("Esteghlal");
		else {
			if (arr[1]==arr[3]) System.out.println("Penalty");
			else {
				if (arr[1] < arr[3]) System.out.println("Persepolis");
				else System.out.println("Esteghlal");
			}
		}
		br.close();
	}
}
