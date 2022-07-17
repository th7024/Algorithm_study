# [10989] 수 정렬하기 3

## 분류
> 정렬

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.InputStreamReader;

public class Q10989 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			bw.write(arr[i]+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

N크기의 배열을 입력받고 오름차순으로 정렬해 출력하는 문제이다.

N을 입력받고 N크기의 배열 arr를 만든 후 Arrays.sort를 통해 오름차순으로 정렬한 후 출력해준다.