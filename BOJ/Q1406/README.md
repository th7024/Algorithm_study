# [1406] 에디터

## 분류
> 자료 구조
>
> 스택
>
> 연결 리스트

## 코드
```java
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

```

## 문제풀이

한 줄로 된 간단한 에디터를 구현하려고 한다. 이 편집기는 영어 소문자만을 기록할 수 있는 편집기로, 최대 600,000글자까지 입력할 수 있다.

이 편집기에는 '커서'라는 것이 있는데, 커서는 문장의 맨 앞(첫 번째 문자의 왼쪽), 문장의 맨 뒤(마지막 문자의 오른쪽), 또는 문장 중간 임의의 곳(모든 연속된 두 문자 사이)에 위치할 수 있다. 즉 길이가 L인 문자열이 현재 편집기에 입력되어 있으면, 커서가 위치할 수 있는 곳은 L+1가지 경우가 있다.

이 편집기가 지원하는 명령어는 다음과 같다.

| L    | 커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)  |
| :--- | ------------------------------------------------------------ |
| D    | 커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨) |
| B    | 커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨) 삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임 |
| P $  | $라는 문자를 커서 왼쪽에 추가함                              |

처음에는 어레이리스트를 써서 cursor라는 변수를 만들어 풀었는데 시간초과가 발생했다.

그래서 링크드리스트로 바꾸고 ListIterator를 커서 역할로 대신하였다. 

ListIterator는 양방향 탐색이 가능해 커서역할을 수행 할 수 있었다.