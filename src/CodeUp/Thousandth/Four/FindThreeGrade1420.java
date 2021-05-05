package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindThreeGrade1420 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		Map<Integer, String> map = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			map.put(Integer.parseInt(tmp.split(" ")[1]), tmp.split(" ")[0]);
			arr[i] = Integer.parseInt(tmp.split(" ")[1]);
		}
		Arrays.sort(arr);
		
		System.out.println(map.get(arr[arr.length-3]));
	}
}
