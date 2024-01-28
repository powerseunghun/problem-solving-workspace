package Acmicpc.As.B5.TwentyThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toMap;

public class SpecialName27889 {
	static final Map<String, String> map = Stream.of(new Object[][] {
		{"NLCS", "North London Collegiate School"}, 
		{"BHA", "Branksome Hall Asia"}, 
		{"KIS", "Korea International School"},
		{"SJA", "St. Johnsbury Academy"}
	}).collect(toMap(data -> (String)data[0], data-> (String)data[1]));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(map.get(br.readLine()));
		br.close();
	}
}
