package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Q18258 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> l = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				l.add(Integer.parseInt(s[1]));
				break;
			case "pop":
				if(l.isEmpty()) bw.write("-1\n");
				else bw.write(l.poll()+"\n");
				break;
			case "size":
				bw.write(l.size()+"\n");
				break;
			case "empty":
				if(l.isEmpty()) bw.write("1\n");
				else bw.write("0\n");
				break;
			case "front":
				if(l.isEmpty()) bw.write("-1\n");
				else bw.write(l.peekFirst()+"\n");
				break;
			case "back":
				if(l.isEmpty()) bw.write("-1\n");
				else bw.write(l.peekLast()+"\n");
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
