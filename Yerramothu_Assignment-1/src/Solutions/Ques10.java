package Solutions;

import java.util.*;

public class Ques10 {

	public static void main(String[] args) {
		Deque<String> Deq = new ArrayDeque<>();
		List<Integer> Arr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of Deque");
		int len = input.nextInt();		
		System.out.println("Enter the list of Characters for Deque");
		for(int i=1; i<=len;i++) {
			Deq.add(input.next());
		}		
		System.out.println("Enter the length of Array of operations");
		int len_array = input.nextInt();		
		System.out.println("Enter the Array of operations in 1 and 0 ");
		for(int i=1; i<=len_array;i++) {
			Arr.add(input.nextInt());
		}		
		System.out.println("List of Deque : " + Deq);
		System.out.println("Array of operations : " + Arr);		
		Deque<String> D_dup = new LinkedList<>(Deq);
		Stack<String> S = new Stack<>();		
		for(int e : Arr) {
			switch(e) {
			 	case 1: if(!D_dup.isEmpty()) {
			 		S.add(D_dup.pollFirst());
			 		break;
			 	}
			 	case 0: if(!S.isEmpty()) {
			 		D_dup.addFirst(S.pop());
			 		break;
			 	}
			}
		}		
		Iterator<String> objIterator = D_dup.iterator();  
		while(objIterator.hasNext())
		{
			System.out.print(objIterator.next());
		}
		input.close();
	}	
}