# [2577] 숫자의 개수

## 분류
> 수학
>
> 구현
>
> 사칙연산

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2577 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int ans = 1;
		int[] arr = new int[10];
		for(int i=0;i<3;i++) {
			int num = Integer.parseInt(br.readLine());
			ans *= num;
		}
		String s = Integer.toString(ans);
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'0'] +=1;
		}
		for(int i=0;i<arr.length;i++) {
			bw.write(arr[i]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

3개의 정수를 입력받고 3수의 곱을 구한다. 0~9 가 그 수에 몇번이 들어있는지 구하는 문제이다.

1번째 반복문에서는 3정수의 곱을 구하고 2번째 반복문에서는 0~9가 있는 배열 arr에 ans를 뜯어 체크를 해준다.

3번째 반복문에서는 arr를 0~9까지 출력해준다.