package Solutions;

import java.util.LinkedList;
import java.util.Scanner;

public class Ques01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<Integer> L1 = new LinkedList<>();
		System.out.println("enter the size");
		int arSize = input.nextInt();
		while(arSize>0) { 
			System.out.println("Enter the elements to the list : ");
	        L1.add(input.nextInt());
	        arSize--;  
	        }
	        input.close();
	    Q1(L1);
	}
	public static void Q1(LinkedList<Integer> L1) {
    	LinkedList<Integer> L2 = new LinkedList<>();
    	for (int i = 0; i < L1.size(); i++) {
    		int a = L1.get(i);
    		int sum = 0;
    		for (int j=1; j<=a/2; j++) {
    			if (a%j == 0) {
    				sum += j;
    			}
    		}
    		if (sum == a) {
    			L2.add(a);
    		}
    	}
    	System.out.println(L2);
    }
}
