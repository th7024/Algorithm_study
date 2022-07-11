# [2750] 수 정렬하기

## 분류
> 구현
>
> 정렬

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2750 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		
		for(int i=0;i<N;i++)
			bw.write(arr[i]+"\n");
		br.close();
		bw.flush();
		bw.close();
				
	}
}

```

## 문제풀이

정수 N을 입력받고 N크기의 배열 arr를 만들어준다.

배열을 입력받고 

sort 함수를 통해 배열을 오름차순으로 정렬해준다.

그 후 0부터 N-1까지 arr[i]를 출력해준다.

