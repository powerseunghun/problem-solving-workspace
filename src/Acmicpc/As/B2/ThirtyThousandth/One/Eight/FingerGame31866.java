package Acmicpc.As.B2.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FingerGame31866 {
	static boolean isValid(String str) {
		return str.equals("0") || str.equals("2") || str.equals("5");
	}
	static String func(String str) {
		String repStr = str.replaceAll("[0|2|5| ]", "");
		String js = str.split(" ")[0];
		String ij = str.split(" ")[1];
		if (js.equals(ij)) return "=";
		if (repStr.length() != 0) {
			return isValid(js) ? ">" : isValid(ij) ? "<" : "=";
		}
		
		if (js.equals("0")) {
			return ij.equals("2") ? ">" : "<";
		} else if (js.equals("2")) {
			return ij.equals("0") ? "<" : ">";
		} else {
			return ij.equals("0") ? ">" : "<";
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(func(str));
		br.close();
	}
}
