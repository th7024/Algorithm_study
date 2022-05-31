# [10807] 개수 세기

## 분류
> 구현

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10807 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		int findn = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==findn) cnt++;
		}
		bw.write(String.valueOf(cnt));
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

num크기의 배열에서 findn의 개수가 몇개인지 찾는 문제이다. 

 num크기의 배열 arr을 생성하고 입력 받아준 후, 개수 체크를 위한 변수 cnt를 만든다.

arr의 크기만큼 반복문을 진행하는데 arr[i]가 findn이라면 cnt 를 증가시켜준다.