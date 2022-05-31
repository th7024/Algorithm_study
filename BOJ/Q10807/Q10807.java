package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10807 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		int findn = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==findn) cnt++;
		}
		bw.write(String.valueOf(cnt));
		br.close();
		bw.flush();
		bw.close();
	}
}
