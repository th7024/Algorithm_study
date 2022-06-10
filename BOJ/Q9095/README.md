# [9095] 1,2,3 더하기

## 분류
> 다이나믹 프로그래밍

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9095 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		dp[1] = 1;dp[2] = 2;dp[3]=4;
		for(int i=4;i<dp.length;i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		for(int i=0;i<tc;i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(dp[n]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
```

## 문제풀이

##  문제

1,2,3을 이용해서 숫자를 표현하는 문제이다.

4의 경우에는  총 7가지 방법이 있으며 수를 나타낼 때는 1개 이상의 숫자를 사용해야 한다.

- 1+1+1+1

- 1+1+2

- 1+2+1

- 2+1+1

- 2+2

- 1+3

- 3+1

  1 2 3 4

  1 2 4 7

  이런식으로 증가한다고 가정했을 때,

  4 = 1 + 2 + 3

  7 = 1 + 2 + 4 라는 것을 알 수 있다.

  때문에 점화식은 dp[i] =  dp[i-1] + dp[i-2] + dp[i-3]가 된다.

  n은 최대 11까지이기 때문에 배열을 11로 선언해주고 미리 DP연산을 끝낸다.

  그 후 testcase만큼 n을 입력받아 arr[n]을 출력해주면 된다.