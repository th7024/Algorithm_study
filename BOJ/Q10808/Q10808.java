package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10808 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			arr[c-'a'] +=1;
		}
		br.close();
		for(int i=0;i<arr.length;i++)
			bw.write(arr[i]+ " ");
		bw.flush();
		bw.close();
	}
}
