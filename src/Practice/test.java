package Practice;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) throws ParseException {
		Map<String, Integer> map = new HashMap<>();

		map.put("ddobot", 3);
		if (!map.containsKey("ddobot")) {
			System.out.println("H"); 
		}
		else {
			map.put("ddobot", map.get("ddobot") + 7);
			System.out.println(map.get("ddobot"));
		}
	}
}
