package Acmicpc.As.S5.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polyomino1343 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		str = str.replaceAll("XXXX", "AAAA");
		str = str.replaceAll("XX", "BB");
		
		System.out.println(str.contains("X") ? "-1" : str);
		br.close();
	}
}
