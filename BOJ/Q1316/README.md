# [1316] 그룹 단어 체커

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

public class Q1316 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0;i<num;i++) {
			String s = br.readLine();
			int[] alpha = new int [26];
			boolean flag = true;
			char lc=' ';
			for(int j=0;j<s.length();j++) {
				char c = s.charAt(j);
				if(alpha[c-'a'] == 1&&lc!=c)
					flag = false;
				alpha[c-'a'] = 1;
				if(flag==false) break;
				lc = c;
			}
			if(flag)
				cnt++;
		}
		br.close();
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
```

## 문제풀이

그룹 단어를 구하는 문제이다.

그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

testcase num을 입력받고, 각 단어마다 그룹 단어인지 체크를 해주면 된다.

alpha배열을 만들고 이미 체크가 되어 있는데 또 다시 참조를 한다면 그룹 단어가 아니기 때문에 flag를 false로 만들어주었다.

연속되는 단어의 경우는 예외로 잡아줘야하기 때문에 lc라는 변수에 담아주었다.

반복문이 끝나고 나서 flag가 true라면 cnt를 증가시켜 주었다.