package Acmicpc.As.B4.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ISpeakTXTMSG6841 {
	static String[] sfs = {"CU", ":-)", ":-(", ";-)", ":-P", "(~.~)", "TA", "CCC", "CUZ", "TY", "YW", "TTYL"};
	static String[] msgs = {
			"see you",
			"I’m happy",
			"I’m unhappy",
			"wink",
			"stick out my tongue",
			"sleepy",
			"totally awesome",
			"Canadian Computing Competition",
			"because",
			"thank-you",
			"you’re welcome",
			"talk to you later"
	};
	static Map<String, String> map = new HashMap<>();
	static void mapInit() {
		for (int i = 0; i < sfs.length; i++) {
			map.put(sfs[i],msgs[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		mapInit();
		
		while(true) {
			str = br.readLine();
			System.out.println(map.containsKey(str) ? map.get(str) : str);
			if (str.equals("TTYL")) break;
		}
		br.close();
	}
}

