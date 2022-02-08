package Solutions;

import java.util.*;

public class Ques06 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the even size of stack: ");
		int size = input.nextInt();
		while(true) {
			if (size % 2 == 0) {
				break;
			}
			else {
				System.out.println("Sorry, you have entered odd size. Please enter even size again: ");
				size = input.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements to store in to the stack: ");
			stack.push(input.nextInt());
		}
		
		Q6(stack,size);
		input.close();
	}
	
	public static void Q6(Stack<Integer> stack, int size) {
		ArrayList<Integer> Arr = new ArrayList<>();
		int p = size / 2;
		for (int i = 0; i < size; i++) {
			if(i < p) {
				Arr.add(stack.pop());
			}
			else {
				Arr.add(stack.get(i-p));
			}
		}
		System.out.println(Arr);
	}

}
