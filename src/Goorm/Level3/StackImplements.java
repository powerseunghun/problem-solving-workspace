package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StackImplements {
	static final int size = 10;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> st = new ArrayList<>();
		
		for (int i = 0, val = 0; i < N; i++) {
			val = Integer.parseInt(br.readLine());
			switch(val) {
			case 0:
				int data = Integer.parseInt(br.readLine());
				if (st.size() < size) st.add(data);
				else System.out.println("overflow");
				break;
			case 1:
				if (st.size() == 0) System.out.println("underflow");
				else st.remove(st.size()-1);
				break;
			default: i = N+1; break;
			}
		}
		for (int i = 0; i < st.size(); i++) {
			System.out.print(st.get(i) + " ");
		}
	}
}
