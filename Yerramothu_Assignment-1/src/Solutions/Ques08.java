package Solutions;

import java.util.*;

public class Ques08 {

	public static void main(String[] args) {
	Queue<Integer> Q = new LinkedList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of Queue: ");
		int size = input.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements to QUEUE: ");
			Q.add(input.nextInt());
		}
	
		Q8 (Q,size);
		input.close();
	}
	
	public static void Q8(Queue<Integer> Q1, int size) {
		ArrayList<Integer> Arr1 = new ArrayList<>();
		ArrayList<Integer> Arr2 = new ArrayList<>();
		for (Integer item: Q1) {
            Arr1.add(item);
        }
		
		for(int i = 0; i < size/2; i++) {
			Arr2.add(Arr1.get(size-i-1));
			Arr2.add(Arr1.get(i));
		}
		if (size % 2 != 0) {
			Arr2.add(Arr1.get(size/2));
		}
		
		System.out.println(Arr2);
	}
	
	
}