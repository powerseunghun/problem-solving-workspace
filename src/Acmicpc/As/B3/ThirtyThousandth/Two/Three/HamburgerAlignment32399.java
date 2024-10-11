package Acmicpc.As.B3.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toMap;

public class HamburgerAlignment32399 {
	static Map<String, Integer> map = Stream.of(new Object[][] {
		{"(1)", 0}, {")1(", 2}
	}).collect(toMap(data -> (String) data[0], data -> (Integer) data[1]));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(map.containsKey(str) ? map.get(str) : "1");
		br.close();
	}
}
