package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {
	public static void main(String args[]) throws IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int back = -1;
		for(int i =0;i<n;i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				back = Integer.parseInt(s[1]);
				q.add(back);
				break;
			case "pop":
				if(q.isEmpty())
					bw.write("-1\n");
				else {
					int a = q.poll();
					bw.write(a+"\n");
				}
				break;
			case "size":
				bw.write(q.size()+"\n");
				break;
			case "empty":
				if(q.isEmpty())
					bw.write("1\n");
				else bw.write("0\n");
				break;
			case "front":
				if(q.isEmpty())
					bw.write("-1\n");
				else
					bw.write(q.peek()+"\n");
				break;
			case "back":
				if(q.isEmpty())
					bw.write("-1\n");
				else
					bw.write(back+"\n");
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
