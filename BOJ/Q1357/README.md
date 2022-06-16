# [1357] 뒤집힌 덧셈

## 분류
> 구현 
>
> 문자열

## 코드
```java
package BOJ;


import java.util.Scanner;

public class Q1357 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st1 = "";
		String st2 = "";
		String st3 = "";
		
		String num1 = sc.next();
		String num2 = sc.next();
		for(int i=num1.length()-1; i>=0; i--) {
			st1 = st1+String.valueOf(num1.charAt(i));
		}
		for(int i=num2.length()-1; i>=0; i--) {
			st2 = st2+String.valueOf(num2.charAt(i));
		}
		
		int ch= Integer.parseInt(st1)+Integer.parseInt(st2);
		String num3 = String.valueOf(ch);
		
		for(int i=num3.length()-1; i>=0; i--) {
			st3 = st3+String.valueOf(num3.charAt(i));
		}
		System.out.println(Integer.parseInt(st3));
	}
	
}
```

## 문제풀이

어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다. Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자. 예를 들어, X=123일 때, Rev(X) = 321이다. 그리고, X=100일 때, Rev(X) = 1이다.

두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오

함수로 구현해서 했어야 했는데 그냥 반복문으로 만들었다. 다음에는 함수로 만들어서 풀어야겠다.