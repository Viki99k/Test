package test;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean ans = checkPalindrome(str);
		System.out.println("string is paliindrome " + ans);
	}
	
	
	public static boolean checkPalindrome(String str) {

		
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = str.length()-1;

        while(i<=j)
        {
            if(str.charAt(i++)!=str.charAt(j--))

            {
                return false;
            }

        }

 

        return true;
}

}
