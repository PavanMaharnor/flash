package com.test;

import java.util.Scanner;

public class CleanString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter test string");
		String st=sc.next();
		stringClan(st);

	}
	public static void stringClan(String arg){
		char ch[]=arg.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++){
			boolean repated=false;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i] == ch[j]){
					repated = true;
					break;
					
				}
				
			}if(!repated){
				sb.append(ch[i]);
			}
			
		}
		System.out.println(sb);
		
	}

}
