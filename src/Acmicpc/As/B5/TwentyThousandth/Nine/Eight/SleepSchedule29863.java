package Acmicpc.As.B5.TwentyThousandth.Nine.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SleepSchedule29863 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t1 = Integer.parseInt(br.readLine());
		int t2 = Integer.parseInt(br.readLine());
		
		System.out.println(t1 >= 20 && t1 <= 23 ? 24-t1+t2 : t2-t1);
		br.close();
	}
}
