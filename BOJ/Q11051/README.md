# [11051] 이항계수 2

## 분류
> 수학
>
> 다이나믹프로그래밍
>
> 조합론

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11051 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n+1][n+1];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0||j==0)
					arr[i][j]=1;
				else
					arr[i][j]=(arr[i-1][j-1]+arr[i-1][j]) %10007;
				}
		}
		bw.write(String.valueOf(arr[n][k]));
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

그냥 깡으로 구현해서 풀려고 했다가 파스칼의 삼각형을 이용하면 풀리는 문제라는 걸 알게 되었다.

![image-20220630232108447](C:\Users\USER\AppData\Roaming\Typora\typora-user-images\image-20220630232108447.png)

즉 5C2의 경우 4C1과 4C2를 더해주면 된다.

때문에 점화식은 arr[i]\[j]=arr[i-1]\[j-1] + arr[i-1]\[j]가 된다.

하지만 i==j인 경우와 j==0인 경우에는 1로 만들어 주어야한다.

2차원 배열을 만들고 반복문을 통해 값을 구해주면 된다.

왜 DP문제인지 알거같다.