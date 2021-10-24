package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstAndSecond {
	static boolean func(String str) {
		boolean flag1 = false, flag2 = false;
		if (!(str.contains("12") && str.contains("21"))) {
			return false;
		}
		if (str.contains("12")) {
			str = str.replaceFirst("12", "");
			flag1 = true;
		}
		if (str.contains("21")) {
			str = str.replaceFirst("21", "");
			flag2 = true;
		}
		return flag1 && flag2;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(func(str) ? "Yes" : "No");
	}
}
