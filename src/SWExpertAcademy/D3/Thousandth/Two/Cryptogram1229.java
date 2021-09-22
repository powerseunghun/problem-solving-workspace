package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Cryptogram1229 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = null;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String com = null;
		int x = 0, y = 0, s = 0;
		
		for (int i = 1; i <= 10; i++) {
			sb.append("#" + i + " ");
			br.readLine();
			list = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				com = st.nextToken();
				switch(com) {
                case "I":
                    x = Integer.parseInt(st.nextToken());
                    y = Integer.parseInt(st.nextToken());
                    for (int j = 0, idx=x+j; j < y; j++, idx++) {
                        s = Integer.parseInt(st.nextToken());
                        list.add(idx, s);
                    }
                    break;
                case "D":
                    x = Integer.parseInt(st.nextToken());
                    y = Integer.parseInt(st.nextToken());
                    for (int j = 0; j < y; j++) {
                        list.remove(x);
                    }
                    break;
                }
			}
			for (int j = 0; j < 10; j++) {
				sb.append(list.get(j) + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}