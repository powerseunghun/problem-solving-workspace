package SWExpertAcademy.D3.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class BlackJack9778 {
    static void init(int[] arr) {
        Arrays.fill(arr, 4);
        arr[0] = 0;
        arr[1] = 0;
        arr[10] = 16;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()), N = 0, sum = 0;
        int cnt1 = 0, cnt2 = 0;
        int[] arr = new int[12];
         
        for (int i = 1; i <= T; i++) {
            N = Integer.parseInt(br.readLine());
            sum = 0;
            cnt1 = 0;
            cnt2 = 0;
            init(arr);
            for (int j = 0, val = 0; j < N; j++) {
                val = Integer.parseInt(br.readLine());
                sum += val;
                arr[val]--;
            }
            for (int j = 2; j < arr.length; j++) {
                if (arr[j] == 0) continue;
                if (sum + j > 21) cnt1 += arr[j];
                else if (sum + j <= 21) cnt2 += arr[j];
            }
            if (cnt1 >= cnt2) sb.append("#" + i + " STOP\n");
            else sb.append("#" + i + " GAZUA\n");
        }
        System.out.print(sb.toString());
    }
}