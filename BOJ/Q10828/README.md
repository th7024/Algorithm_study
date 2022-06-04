# [10828] 스택

## 분류
> 자료구조
>
> 스택

## 코드
```java
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

```

## 문제풀이

스택 자료구조에 대한 문제이다.

명령수 num이 주어질 때, 각 명령에 맞는 행동을 취하면 된다.

입력은 문자열 형태로 받으면서 push의 경우에는 뒤에 정수가 붙기 때문에 spilt으로 분리를 해주었다.

switch구문으로 s[0]을 구분지어 구현하였다.