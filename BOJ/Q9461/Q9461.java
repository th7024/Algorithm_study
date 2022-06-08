package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9461 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		long[] arr = new long[100];
		arr[0]=1;arr[1]=1;arr[2]=1;arr[3]=2;arr[4]=2;
		for(int i=0;i<testcase;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n>4) {
				for(int j=5;j<n;j++) {
					arr[j]=arr[j-1]+arr[j-5];
				}
			}
			bw.write(arr[n-1]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
