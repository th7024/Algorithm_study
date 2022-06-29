# [11023] 더하기 3

## 분류
> 구현
>
> 수학
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

public class Q11023 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int sum = 0;
		for(int i=0;i<s.length;i++) {
			sum+=Integer.parseInt(s[i]);
		}
		br.close();
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

N개의 수를 입력받았을 때 합을 구하는 문제이다.

N이 주어지지 않기 때문에 문자열로 입력받아 잘라서 배열에 담아주었다.

배열의 크기만큼 반복문을 돌면서 sum변수에 합을 더해주었다.