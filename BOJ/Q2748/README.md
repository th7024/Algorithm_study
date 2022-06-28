# [2748] 피보나치 수 2

## 분류
> 수학
>
> 다이나믹 프로그래밍

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2748 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n+2];
			arr[0]=0;
			arr[1]=1;
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		br.close();
		bw.write(arr[n]+"\n");
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

피보나치 수를 구하는 문제이다. 정수 n 이 주어지면 n번째 피보나치 수를 구하면 된다.

피보나치 수는 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 순으로 증가하며 

점화식은  Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

피보나치 수가 저장될 배열은 0의 경우를 생각해 n+2로 설정해주었다.

n의 최대 입력이 90인데 90의 경우를 생각해 배열의 자료형을 long으로 해주었다. int의 경우에는 90번째 피보나치 수는 담지 못한다.