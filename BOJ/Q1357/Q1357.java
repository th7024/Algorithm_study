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