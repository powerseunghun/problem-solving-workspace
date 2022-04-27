package Codeforce.OrderSubmit.OneThousandth.EightHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AntonAndPolyHedrons {
	static Map<String, Integer> map = new HashMap<>();
	static void mapInit() {
		String[] strs = {"Tetrahedron", "Cube", "Octahedron", "Dodecahedron", "Icosahedron"};
		int[] arr = {4, 6, 8, 12, 20};
		for (int i = 0; i < strs.length; i++) {
			map.put(strs[i], arr[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		mapInit();
		
		for (int i = 0; i < N; i++) {
			sum += map.get(br.readLine());
		}
		
		System.out.println(sum);
		br.close();
	}
}
