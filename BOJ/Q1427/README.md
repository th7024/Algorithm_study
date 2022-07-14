# [1427] 소트인사이드

## 분류
> 정렬
>
> 문자열

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.io.InputStreamReader;

public class Q1427 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		Integer[] arr = new Integer[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i)-'0';
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
			bw.write(arr[i]+"");
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

숫자를 내림차순으로 정렬하는 문제이다.

 N은 1,000,000,000보다 작거나 같은 자연수 N이 주어질 때 N의 자리숫를 내림차순으로 정렬한다.

먼저 입력을 문자열로 받은 후 정수형 배열에 각 자리를 잘라 넣어준다.

Arrays.sort함수를 통해 정렬을 해주는데 내림차순으로 정렬해야하기 때문에  Collections.reverseOrder()을 이용해 주었다. 그 후 배열을 출력해주면 된다.