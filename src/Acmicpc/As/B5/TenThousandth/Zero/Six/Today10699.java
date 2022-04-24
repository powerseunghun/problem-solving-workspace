package Acmicpc.As.B5.TenThousandth.Zero.Six;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Today10699 {
	static Map<String, String> map = new HashMap<>();
	static void mapInit() {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		for (int i = 1; i <= 12; i++) {
			map.put(months[i-1], String.format("%02d", i));
		}
	}
	public static void main(String[] args) {
		Date date = new Date();
		String[] dateInfo = date.toString().split(" ");
		mapInit();
		
		System.out.println(dateInfo[5] + "-" + map.get(dateInfo[1]) + "-" + dateInfo[2]);
	}
}
