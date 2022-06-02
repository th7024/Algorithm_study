package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10798 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr= new char[5][15];
		for(int i = 0; i<5;i++) {
			String s = br.readLine();
			for(int j=0;j<s.length();j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j][i]==' '||arr[j][i]=='\0')
					continue;
				else
					bw.write(arr[j][i]);
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
