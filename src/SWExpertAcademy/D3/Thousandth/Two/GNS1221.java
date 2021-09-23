package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class GNS1221 {
	static Map<String, Integer> map = new HashMap<>();
	static void mapInit() {
		String[] str = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		for (int i = 0; i < str.length; i++) {
			map.put(str[i], i);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		StringBuilder sb = new StringBuilder();
		String[] arr = null;
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		mapInit();
		
		for (int i = 1; i <= 10; i++) {
			sb.append("#" + i + "\n");
			N = Integer.parseInt(br.readLine().split(" ")[1]);
			arr = new String[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = st.nextToken();
			}
			Arrays.sort(arr, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return map.get(o1)-map.get(o2);
				}
			});
			for (int j = 0; j < arr.length; j++) {
				sb.append(arr[j] + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
