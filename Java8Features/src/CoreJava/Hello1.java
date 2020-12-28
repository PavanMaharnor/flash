package CoreJava;

import java.util.Scanner;

public class Hello1 {

	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner sc=new Scanner(System.in);
		int i= sc.nextInt();
		System.out.println("enter second number");
		int j=sc.nextInt();
		System.out.println( i+j);
	}
}
