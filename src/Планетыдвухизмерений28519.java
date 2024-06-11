import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Планетыдвухизмерений28519 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		int res = 0;
		
		res = n <= m ? 2*n : 2*m;
		res = n != m ? res + 1 : res;
		
		System.out.println(res);
		br.close();
	}
}