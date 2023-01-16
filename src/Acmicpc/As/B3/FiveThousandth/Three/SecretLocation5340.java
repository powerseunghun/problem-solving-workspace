package Acmicpc.As.B3.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretLocation5340 {
	static int[] arr = new int[6];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			arr[i] = str.charAt(str.length()-1) == ' ' ? str.length()-1 : str.length();
		}
		
		System.out.println("Latitude " + String.format("%d:%d:%d", arr[0], arr[1], arr[2]));
		System.out.println("Longitude " + String.format("%d:%d:%d", arr[3], arr[4], arr[5]));
		br.close();
	}
}
