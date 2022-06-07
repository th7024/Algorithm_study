# [11728] 배열 합치기

## 분류
> 정렬
>
> 두 포인터

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q11728 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<2;i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0;j<s.length;j++)
				al.add(Integer.parseInt(s[j]));
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			bw.write(al.get(i)+" ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

정렬이 되어있는 두 배열 A B가 주어질 때 하나의 배열로 합쳐서 정렬한 다음 출력하는 문제이다.

나는 그냥 가변크기의 어레이 리스트를 받고 문자열로 입력받아 다 어레이리스트에 넣어줬다.

두 개의 배열 모두 입력이 끝나면 Collections를 통해 al를 정렬해주었다. 

시간초과가 뜨지 않을까 걱정했는데 다행히 바로 통화했다