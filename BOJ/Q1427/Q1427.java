package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.io.InputStreamReader;

public class Q1427 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		Integer[] arr = new Integer[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i)-'0';
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
			bw.write(arr[i]+"");
		br.close();
		bw.flush();
		bw.close();
	}
}
