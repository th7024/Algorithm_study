package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10820 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= null;
		while((s=br.readLine())!=null) {
			int space=0,R=0,S=0,I=0;
			for(int n = 0;n<s.length();n++) {
				char c = s.charAt(n);
				if(c==' ') space++;
				else if(c>='a'&&c<='z') S ++;
				else if(c>='A'&&c<='Z') R++;
				else I++;
			}
			System.out.println( S+" " + R+" " + I+" " + space);
		}	
		br.close();
	}
}
