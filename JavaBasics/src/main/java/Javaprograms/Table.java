package Javaprograms;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:" + sc);
		int a11 = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(a11 + "*" + i + "=" + a11 * i);
		}
		System.out.println("enter number:" + sc);
		int a12 = sc.nextInt();
       
		  for (int j=10;j>1;j--) 
		  { System.out.println(a12 + "*" +j +"=" + a12*j);
		  
		  }
		 
		  

	}

}
