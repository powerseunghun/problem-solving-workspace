package Acmicpc.As.B3.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaltBomb13223 {
	static int getTime(int[] arr) {
		int sum = 0, w = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			sum += arr[i] * Math.pow(60, w++);
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int[] arr = null;
		int time = 0;
		
		for (int i = 0; i < 2; i++) {
			arr = new int[3];
			tmp = br.readLine();
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(tmp.split(":")[j]);
			}
			time += i == 0 ? getTime(arr)*-1 : getTime(arr);
		}
		if (time < 0) time += 86400;
		time %= 86400;
		if (time == 0) time = 86400;
		
		System.out.println(String.format("%02d:%02d:%02d", time/3600, time%3600/60, time%60));
		br.close();
	}
}
