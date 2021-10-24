package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Attendance {
	// tc 8 ~ TLE need improve yet
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine()), tsb = null;
		String res = sb.toString(), tmp = null;
		
		for (int i = 0; i < sb.toString().length(); i++) {
			tsb = new StringBuilder(sb.toString());
			tmp = tsb.deleteCharAt(i).toString();
			
			res = res.compareTo(tmp) > 0 ? tmp : res;
		}
		System.out.println(res);
	}
}
