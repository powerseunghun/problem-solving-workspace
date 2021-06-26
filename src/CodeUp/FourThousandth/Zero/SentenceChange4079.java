package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SentenceChange4079 {
	static void init() {
		String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for (int i = 0; i < num.length; i++) {
			map.put(i, num[i]);
		}
	}
	static Map<Integer, String> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		init();
		
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					sb.append((char)(str.charAt(i)-32));
				}
				else {
					sb.append(str.charAt(i));
				}
			}
			else {
				if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
					if (str.charAt(i-1) == ' ' && str.charAt(i+1) == ' ') {
						sb.append((str.charAt(i)+"").toUpperCase());
					}
					else if (str.charAt(i-1) == ' ' && (str.charAt(i+1) == '.' || str.charAt(i+1) == ',' || str.charAt(i+1) == '?' || str.charAt(i+1) == '!' )) {
						sb.append((str.charAt(i)+"").toUpperCase());
					}
					else {
						sb.append((str.charAt(i)+"").toLowerCase());
					}
				}
				else if (str.charAt(i) == ' ' || i == str.length()-1) sb.append(str.charAt(i));
				else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					sb.append(map.get(Integer.parseInt(str.charAt(i)+"")));
				}
				else {
					sb.append((str.charAt(i)+"").toLowerCase());
				}
			}
		}
		System.out.println(sb.toString());
	}
}
