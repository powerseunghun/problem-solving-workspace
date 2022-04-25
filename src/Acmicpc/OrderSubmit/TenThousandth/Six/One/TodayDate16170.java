package Acmicpc.OrderSubmit.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TodayDate16170 {
	static Map<String, String> map = new HashMap<>();
	static void mapInit() {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		for (int i = 0; i < months.length; i++) {
			map.put(months[i], String.format("%02d", i+1));
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dateInfo = new Date().toString().split(" ");
		mapInit();
		
		System.out.println(dateInfo[5]);
		System.out.println(map.get(dateInfo[1]));
		System.out.println(dateInfo[2]);
		br.close();
	}
}
