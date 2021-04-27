package CodeUp.Basic100;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IO1020 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		sb.replace(6, 7, "");
		System.out.println(sb);
	}
}
