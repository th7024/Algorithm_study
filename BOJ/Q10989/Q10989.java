package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.InputStreamReader;

public class Q10989 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			bw.write(arr[i]+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
}
