package Javaprograms;

import org.checkerframework.checker.units.qual.Length;

public class Duplicateelements {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,50,10,20};
		
		for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[j]!=a[i]) {
				System.out.println(a[j]);
			}
				
		}
		}
		 

}}
