# [10820] 문자열 분석

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

public class Q10820 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= null;
		while((s=br.readLine())!=null) {
			int space=0,R=0,S=0,I=0;
			for(int n = 0;n<s.length();n++) {
				char c = s.charAt(n);
				if(c==' ') space++;
				else if(c>='a'&&c<='z') S ++;
				else if(c>='A'&&c<='Z') R++;
				else I++;
			}
			System.out.println( S+" " + R+" " + I+" " + space);
		}	
		br.close();
	}
}

```

## 문제풀이

이번 문제는 testcase가 없다.

그래서 s의 입력이 빌 때까지만 반복문을 반복해주었다.

문자열 s를 입력받으면 s에서 소문자 대문자 숫자 공백의 개수를 구하는 문제이다.

s의 길이만큼 반복문을 돌면서 소문자인지 대문자인지 숫자, 공백인지 구하면 되는데 

지금 생각해보니 크기 4의 배열을 선언하고 0,1,2,3 으로 하는게 더 깔끔했을거 같다.