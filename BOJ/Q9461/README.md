# [9461] 파도반 수열

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

public class Q9461 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		long[] arr = new long[100];
		arr[0]=1;arr[1]=1;arr[2]=1;arr[3]=2;arr[4]=2;
		for(int i=0;i<testcase;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n>4) {
				for(int j=5;j<n;j++) {
					arr[j]=arr[j-1]+arr[j-5];
				}
			}
			bw.write(arr[n-1]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

##  문제

오른쪽 그림과 같이 삼각형이 나선 모양으로 놓여져 있다. 첫 삼각형은 정삼각형으로 변의 길이는 1이다. 그 다음에는 다음과 같은 과정으로 정삼각형을 계속 추가한다. 나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.

![img](https://www.acmicpc.net/upload/images/pandovan.png)

삼각형은 1, 1, 1, 2, 2, 3, 4, 5, 7, 9 ...순으로 증가한다.

점화식을 세워보면

순서 0 1 2 3 4 5 6 7 8 9
크기 1 1 1  2 2 3 4 5 7 9
5 = 4 + 0
6 = 5 + 1
7 = 6 + 2
8 = 7 + 3
9 = 8 + 4 가 성립이 된다.

즉 arr[i] = arr[i-1] + arr[i-4] 라는 점화식이 나온다.

i-4인 경우에는 5이상인 경우이므로 0~4까지 수를 채워넣어준다.

그 다음 반복문을 수행하면서 dp배열을 채워주고 반복문이 끝나면 arr[n-1]번째를 출력해준다.