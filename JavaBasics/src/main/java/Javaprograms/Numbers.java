package Javaprograms;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a1 = sc.nextInt();
		
		if(a1>0) {
			System.out.println(" positive number");
		}
		else if(a1<0) {
			System.out.println("negative number");
		}
		else if(a1/2 == 0) {
			System.out.println("even number");
		}
		else if (a1/2 != 0) {
			System.out.println("odd number");
		}
		else if (a1 == 0) {
			System.out.println("zero");
		}

	}

}
