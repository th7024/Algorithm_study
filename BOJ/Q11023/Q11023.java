package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11023 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int sum = 0;
		for(int i=0;i<s.length;i++) {
			sum+=Integer.parseInt(s[i]);
		}
		br.close();
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
