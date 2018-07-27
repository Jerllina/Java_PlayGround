package com.helloworld;

public class PrintNum {
	public static void main(String[] args) {
		int num[][]=new int[10][10];
		int n=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				num[i][j]=++n;
				System.out.printf("%3d", num[i][j]);
			}
		}
	}

}
