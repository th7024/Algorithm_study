package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1316 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0;i<num;i++) {
			String s = br.readLine();
			int[] alpha = new int [26];
			boolean flag = true;
			char lc=' ';
			for(int j=0;j<s.length();j++) {
				char c = s.charAt(j);
				if(alpha[c-'a'] == 1&&lc!=c)
					flag = false;
				alpha[c-'a'] = 1;
				if(flag==false) break;
				lc = c;
			}
			if(flag)
				cnt++;
		}
		br.close();
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
	
}
