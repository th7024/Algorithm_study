# [10845] 큐

## 분류
> 자료구조
>
> 큐

## 코드
```java
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

```

## 문제풀이

큐 함수를 구현하는 문제이다.

back의 경우 큐 마지막 인덱스를 참조해야하는데 마지막 입력된 값이 마지막에 들어가 있기 때문에 

back이라는 변수에 q에 입력되는 수를 계속 담아주었다. 그 후 "back"이 될 때 back변수에 저장되어 있는 값을 출력해주었다.

나머지는 큐의 유무를 보고 출력해주었다.