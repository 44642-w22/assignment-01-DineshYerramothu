package Solutions;

import java.util.*;

public class Ques03 {

	public static void main(String[] args) {
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array A1: ");
		int arraySize = input.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements: ");
			A1.add(input.nextInt());
		}
		
		Q3(A1);
		input.close();
	}
	
	public static void Q3(ArrayList<Integer> A1) {
		if(A1.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		}
		else {
			Collections.sort(A1);
			System.out.println(A1.get(A1.size()-1));
		}
	}
}
