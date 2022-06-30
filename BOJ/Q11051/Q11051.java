package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11051 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n+1][n+1];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0||j==0)
					arr[i][j]=1;
				else
					arr[i][j]=(arr[i-1][j-1]+arr[i-1][j]) %10007;
				}
		}
		bw.write(String.valueOf(arr[n][k]));
		br.close();
		bw.flush();
		bw.close();
	}
}
