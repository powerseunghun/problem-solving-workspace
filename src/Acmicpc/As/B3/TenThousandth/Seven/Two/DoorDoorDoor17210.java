package Acmicpc.As.B3.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoorDoorDoor17210 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long N = Long.parseLong(br.readLine());
		int w = Integer.parseInt(br.readLine());
		
		if (N > 5) {
			sb.append("Love is open door\n");
		}
		else {
			for (int i = 2; i <= N; i++) {
				sb.append((w == 0 ? 1 : 0) + "\n");
				w = w == 0 ? 1 : 0;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
