package LettCode.TwoHundred.Easy;

import java.util.ArrayList;
import java.util.List;

public class P119PascalTriangle {
    static int comb(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        else return comb(n-1, r-1) + comb(n-1, r);
    }
    static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(comb(rowIndex, i));
        }
        return list;
    }
    public static void main(String[] args) {
		
	}
}
