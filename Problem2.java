//2) Write a program to print below triangle using for loop
//*****
// ****
//  ***
//   **
//    *

package test;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		for(int i=no;i>=1;i--) {
			
			//space
			for(int j=1;j<=no-i;j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//new line
			System.out.println();
		}

	}

}
