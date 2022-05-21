package Acmicpc.As.B4.TwentyThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmCoordination23375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x = Integer.parseInt(tmp.split(" ")[0]);
		int y = Integer.parseInt(tmp.split(" ")[1]);
		int r = Integer.parseInt(br.readLine());
		
		System.out.println((x-r) + " " + (y+r));
		System.out.println((x+r) + " " + (y+r));
		System.out.println((x+r) + " " + (y-r));
		System.out.println((x-r) + " " + (y-r));
		
		br.close();
	}
}
