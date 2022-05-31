# [10808] 알파벳 개수

## 분류
> 구현
>
> 문자열

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10808 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			arr[c-'a'] +=1;
		}
		br.close();
		for(int i=0;i<arr.length;i++)
			bw.write(arr[i]+ " ");
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

영어를 입력받고 알파벳 개수를 출력하는 문제이다.

arr은 알파벳의 개수만큼 선언해주고 입력받은 영어를 쪼개준다. 그 다음 반복문을 돌면서 알파벳 개수를 체크해주면 된다.