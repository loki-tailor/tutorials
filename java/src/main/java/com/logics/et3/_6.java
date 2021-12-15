package com.logics.et3;

public class _6 {
	public static void main(String[] args) {
		int a[][][] = {
				{
					{ 1, 2, 3 }
				},
				{
					{4, 5},
					{6, 7, 8, 9}
				},
				{
					{10},
					{11, 12},
					{13, 14, 15, 16}
				}
		};
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[0][0].length);
		System.out.println(a[0][0][0]);
	}
}
