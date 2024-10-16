package Acmicpc.As.B4.ThirtyThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeMaster32215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(Integer.parseInt(str.split(" ")[1]) * (Integer.parseInt(str.split(" ")[2])+1));
		br.close();
	}
}
