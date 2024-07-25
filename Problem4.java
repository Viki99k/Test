//4) Write a program to get all possible combinations for an input integer.
//Eg: 
//a) 4321 is the input 
//Output will be 
//3214, 2143, 1432
//b) 2504 is the input
//5042, 4250
//c) 567 is the input
//675, 756 
//d) 750 is the input
//507

package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {

	 public static void main(String[] args) {
	        // Input number
	        Scanner sc = new Scanner(System.in);
	        int no = sc.nextInt();

	            List<Integer> combinations = getCombinations(no);

	            for (int combination : combinations) {
	                System.out.println(combination);
	            }
	        }
	    
	 
	 private static List<Integer> getCombinations(int number) {
	        String numberStr = String.valueOf(number);
	        
	        List<Integer> rotations = new ArrayList<>();
	        
	        for (int i = 1; i < numberStr.length(); i++) { 
	        	
	            String rotatedStr = numberStr.substring(i) + numberStr.substring(0, i);
	            
	            
	            // Only add the number if it does not start with '0'
	            if (rotatedStr.charAt(0) != '0') {
	                rotations.add(Integer.parseInt(rotatedStr));
	            }
	        }
	        
	        return rotations;
	    }
	 
	 
	 

}
