package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2577 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int ans = 1;
		int[] arr = new int[10];
		for(int i=0;i<3;i++) {
			int num = Integer.parseInt(br.readLine());
			ans *= num;
		}
		String s = Integer.toString(ans);
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'0'] +=1;
		}
		for(int i=0;i<arr.length;i++) {
			bw.write(arr[i]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
