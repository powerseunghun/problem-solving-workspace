package Acmicpc.As.B4.ThirtyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatCode31495 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Boolean flag = str.charAt(0) == '"' && str.charAt(str.length()-1) == '"';
		str = str.replaceAll("\"", "");
		
		System.out.println(!flag || str.length() == 0 ? "CE" : str);
		br.close();
	}
}
