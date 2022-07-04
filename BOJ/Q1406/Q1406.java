package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q1406 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> al = new LinkedList<Character>();
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < s.length(); i++)
			al.add(s.charAt(i));
		
		ListIterator<Character> iter = al.listIterator();		
		while(iter.hasNext()) {
			iter.next();
		}
		
		for (int i = 0; i < n; i++) {
			String code = br.readLine();
			char c = code.charAt(0);
			switch (c) {
			case 'P':
				iter.add(code.charAt(2));
				break;
			case 'L':
				if(iter.hasPrevious())
					iter.previous();
				break;
			case 'D':
				if(iter.hasNext())
					iter.next();
				break;
			case 'B':
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			default:
				break;
			}
		}
		for(char ans : al)
			bw.write(ans);
		br.close();
		bw.flush();
		bw.close();
	}
}
