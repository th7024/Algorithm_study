package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10828 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<num;i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				st.add(Integer.parseInt(s[1]));
				break;
			case "pop":
				if(st.isEmpty())
					bw.write("-1\n");
				else
					bw.write(st.pop()+"\n");
				break;
			case "size":
				bw.write(st.size()+"\n");
				break;
			case "empty":
				if(st.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
			case "top":
				if(st.isEmpty())
					bw.write("-1\n");
				else
					bw.write(st.peek()+"\n");
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
