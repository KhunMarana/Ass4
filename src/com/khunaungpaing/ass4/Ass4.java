package com.khunaungpaing.ass4;

public class Ass4 {

	public static void main(String[] args) {
		

		int num = 5;
		for (int i = 0; i < 5 ; i++) {
			int temp = num;

			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <=i; k++) {
				System.out.print(temp);
				temp++;
			}
		
			num--;
		System.out.println();
		}
	}
}
