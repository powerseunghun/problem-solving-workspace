package Acmicpc.Step12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
public class WordSort1181 {
 
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> hash = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int range = 50;

        for (int i = 1; i <= range; i++) {
            hash.put(i, new ArrayList<String>());
        }

        for (int idx=0; idx<len; idx++) {
            String input = sc.next();
            if (!hash.get(input.length()).contains(input)) {
                hash.get(input.length()).add(input);
            }
        }

        for (int i = 1; i <= range; i++) {
            hash.get(i).sort(null);
            for (String str : hash.get(i)) {
                System.out.println(str);
            }
        }
    }
}         
