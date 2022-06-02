# [10798] 세로읽기

## 분류
> 구현
>
> 문자열

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10798 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr= new char[5][15];
		for(int i = 0; i<5;i++) {
			String s = br.readLine();
			for(int j=0;j<s.length();j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(arr[j][i]==' '||arr[j][i]=='\0')
					continue;
				else
					bw.write(arr[j][i]);
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

5*15 크기의 배열을 만들고 5개의 문자열을 입력 받는다. 문자열의 길이는 1~15이다.

입력을 다 받게되면 배열을 세로로 읽기 시작한다.

기존에 배열은 행 -> 열 순으로 읽었다면 반복문을 열 -> 행 즉 15 -> 5로 읽어준다.

그 중 값이 공백이거나 널 값인 경우에는 출력을 하지 않고 나머지는 출력을 해준다.