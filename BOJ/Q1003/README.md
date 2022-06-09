# [1003] 피보나치 함수

## 분류
> 다이나믹 프로그래밍

## 코드
```java
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1003 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		int[] arr = new int[testcase];
		for(int i=0;i<testcase;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] z = new int[41];
		int[] o = new int[41];
		z[0] = 1;
		z[1] = 0;
		o[0] = 0;
		o[1] = 1;
		for(int i=2;i<41;i++) {
			z[i] = z[i-1] + z[i-2];
			o[i] = o[i-1] + o[i-2];
		}
		for(int i=0;i<testcase;i++) {
			bw.write(z[arr[i]] + " " + o[arr[i]]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
//	static int cntz=0,cnto=0;
//	public static void main(String args[]) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int testcase = Integer.parseInt(br.readLine());
//		for(int i=0;i<testcase;i++) {
//			int n = Integer.parseInt(br.readLine());
//			cnto=0;
//			cntz=0;
//			fibo(n);
//			bw.write(cntz+ " "+cnto+"\n"); 
//		}
//		br.close();
//		bw.flush();
//		bw.close();
//	}
//	static int fibo(int n) {
//		if(n==0) {
//			cntz++;
//			return 0;
//		}
//		else if(n==1) {
//			cnto++;
//			return 1;
//		}
//		else {
//			return fibo(n-1) + fibo(n-2);
//		}
//	}
}

```

## 문제풀이

다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.

```
int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}
```

`fibonacci(3)`을 호출하면 다음과 같은 일이 일어난다.

밑에 주석처리한 소스는 시간초과 뜬 소스이다. DP문제인데 아무생각없이 코딩해서 그런거 같다.

DP배열을 0 1 두개 만들어주고, 위에 식과 같이 연산해주었다.

testcase를 미리 배열에 담아두고 이미 연산을 마친 DP배열에서 arr[i]값을 뽑아내주면 된다.