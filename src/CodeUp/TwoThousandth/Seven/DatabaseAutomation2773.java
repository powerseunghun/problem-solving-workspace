package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DatabaseAutomation2773 {
	static void auto(String str, String code) {
		System.out.print("\"" + str.split(",")[0] + "\",\"" + str.split(",")[1] + "\",");
		System.out.println("\"" + code + "\"," + "\"0\",\"\",\"0\",\"0\"");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		String code = tmp.split(" ")[1];
		
		for (int i = 0; i < n; i++) {
			auto(br.readLine(), code);
		}
	}
}
