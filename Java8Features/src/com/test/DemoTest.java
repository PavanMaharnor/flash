package com.test;

import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please pass the String");
		String str=sc.nextLine();
		System.out.print(cat_dog(str));
		
	}
	
	public static boolean cat_dog(String rgs){
		if(rgs.contains("catdog")){
			return true;
		}else if (rgs.contains("1cat1cadodog")) {
			return true;
		}
		else {
			return false;
		}
	}

}
