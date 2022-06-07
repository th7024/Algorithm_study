package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q11728 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<2;i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0;j<s.length;j++)
				al.add(Integer.parseInt(s[j]));
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			bw.write(al.get(i)+" ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
