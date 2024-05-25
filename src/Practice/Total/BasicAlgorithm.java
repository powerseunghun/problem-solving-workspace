package Practice.Total;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Custom comparator wrapper
class wrapper implements Comparable<wrapper>{
	public int value;
	public wrapper() {
		this.value = 0;
	}
	public wrapper(int value) {
		this.value = value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	@Override
	public int compareTo(wrapper o) {
		return this.value-o.value;
	}
}
public class BasicAlgorithm {
	// check array
	static boolean[] check = null;           
	// Integer array
	static int[] nArr = null;
	// Print array
	static int[] arr = null;
	// Graph array
	static int[][] graph = null;
	// Integer ArrayList 
	static ArrayList<Integer> list = null;
	// Queue 
	static Queue<Integer> q = null;
	// StringTokenizer
	static StringTokenizer st = null;
	// weight X
	static final int[] dx = {0,-1,0,1};
	// weight Y
	static final int[] dy = {-1,0,1,0};
	// Buffered Reader
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// String Builder
	static final StringBuilder sb = new StringBuilder();
	static final String[] methodNames = {
			"behavior1","behavior2","behavior3","behavior4",
	};
	static void methodCall(String methodName) {
		
		
	}
	static void func(int N, int d) {
		if (d >= N) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = i;
				func(N, d+1);
				check[i] = false;
			}
		}
	}
	static void func2(int N, int d) {
		if (d >= N) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[d] = i;
			func2(N, d+1);
		}
	}
	static void func3(int M, int V) throws IOException {
		String str = null;
		for (int i = 0, x = 0, y = 0; i < M; i++) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);
			graph[x][y] = 1;
			graph[y][x] = 1;
		}
		
		// vertex initialize
		q = new LinkedList<>();
		check[V] = true;
		q.add(V);
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			System.out.println(tmp);
			for (int i = 0; i < check.length; i++) {
				if (graph[tmp][i] == 1 && !check[i]) {
					check[i] = true;
					q.add(i);
				}
			}
		}
	}
	static void func4(int N) throws IOException {
		int l = 0, r = 0, v = 0, res = 0;
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		l = 0;
		r = list.size()-1;
		while (l < r) {
			v = list.get(l) + list.get(r);
			res = v == N ? res+1 : res;
			if (v <= N) l++;
			else r--;
		}
	}
	public static void behavior1() throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		check = new boolean[N];
		
		func(N, 0);
	}
	public static void behavior2() throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		func2(N, 0);
	}
	public static void behavior3() throws NumberFormatException, IOException {
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int V = Integer.parseInt(str.split(" ")[2]);
		graph = new int[N+1][N+1];
		check = new boolean[N+1];
		
		func3(M, V);
	}
	public static void behavior4() throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		list = new ArrayList<Integer>();
		
		func4(N);
	}
	public static void main(String[] args) throws IOException {
		System.out.println(behavior1());
//		behavior1();
//		behavior2();
//		behavior3();
//		behavior4();
		
		
		br.close();
	}
}
