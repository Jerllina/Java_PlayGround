package com.helloworld;

public class JudgePrime {
	public static void main(String[] args) {
		
		int a=4549;
		boolean res=true;
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				System.out.println(a+"��������");
				res=false;
				break;
			}
		}
		if(res) {
			System.out.println(a+"������");
		}
	}
}
