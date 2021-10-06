package LettCode.TwoHundred.Easy;

import java.util.ArrayList;
import java.util.List;

public class P118PascalTriangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < list.size(); i++) {
            if (i <= 1) {
                for (int j = 0; j <= i; j++) {
                    list.get(i).add(1);
                }
            }
            else {
                for (int j = 0, val1 = 0, val2 = 0; j <= i; j++) {
                    if (j == 0 || j == i) list.get(i).add(1);
                    else {
                        val1 = list.get(i-1).get(j-1);
                        val2 = list.get(i-1).get(j);
                        list.get(i).add(val1+val2);
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
		
	}
}
