package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1003 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		int[] arr = new int[testcase];
		for(int i=0;i<testcase;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] z = new int[41];
		int[] o = new int[41];
		z[0] = 1;
		z[1] = 0;
		o[0] = 0;
		o[1] = 1;
		for(int i=2;i<41;i++) {
			z[i] = z[i-1] + z[i-2];
			o[i] = o[i-1] + o[i-2];
		}
		for(int i=0;i<testcase;i++) {
			bw.write(z[arr[i]] + " " + o[arr[i]]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
//	static int cntz=0,cnto=0;
//	public static void main(String args[]) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int testcase = Integer.parseInt(br.readLine());
//		for(int i=0;i<testcase;i++) {
//			int n = Integer.parseInt(br.readLine());
//			cnto=0;
//			cntz=0;
//			fibo(n);
//			bw.write(cntz+ " "+cnto+"\n"); 
//		}
//		br.close();
//		bw.flush();
//		bw.close();
//	}
//	static int fibo(int n) {
//		if(n==0) {
//			cntz++;
//			return 0;
//		}
//		else if(n==1) {
//			cnto++;
//			return 1;
//		}
//		else {
//			return fibo(n-1) + fibo(n-2);
//		}
//	}
}
