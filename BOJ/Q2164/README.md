# [2164] 카드2

## 분류
> 자료 구조
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

public class Q2164 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
			q.add(i);
		int cnt=0;
		while(q.size()>1) {
			q.poll();
			q.offer(q.poll());
		}
		bw.write(q.poll()+"");
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

N장의 카드가 있을 때 윗장은 버리고 다음장은 맨 밑으로 넣는다 이 동작을 반복하였을 때 마지막 숫자카드가 무엇인지 구하는 문제이다.

큐를 통해 구현하였는데 poll을 통해 카드를 버리는 동작을 구현하였고 offer를 통해 큐의 맨 뒷부분에 넣는 작업을 구현하였다.

카드를 버리는순간 맨 아래에 넣어야하기 때문에 offer(poll)를 해주었다.