package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeTwoArray1445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int al = Integer.parseInt(tmp.split(" ")[0]), bl = Integer.parseInt(tmp.split(" ")[1]);
		int idxa = 0, idxb = 0, idxc = 0;
		int[] a = new int[al], b = new int[bl], c = new int[al+bl];
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(st2.nextToken());
		}
		
		while(idxa < al && idxb < bl) {
			if (a[idxa] <= b[idxb]) {
				c[idxc++] = a[idxa++];
			}
			else {
				c[idxc++] = b[idxb++];
			}
		}
		while(idxa < al) {
			c[idxc++] = a[idxa++];
		}
		while(idxb < bl) {
			c[idxc++] = b[idxb++];
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
