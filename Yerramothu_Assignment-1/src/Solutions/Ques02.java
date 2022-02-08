package Solutions;

import java.util.*;

public class Ques02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<Integer> L1 = new LinkedList<>();
		System.out.println("Enter the size of linked list L1: ");
		int listSize = input.nextInt();
		System.out.println("Enter the value of k whose sum equal to pairs of continuous elements in L1: ");
		int k = input.nextInt();
		while(listSize>0) { 
			System.out.println("Enter the elements to add into list L1: ");
	        L1.add(input.nextInt());
	        listSize--;    
	        }
	        input.close();   
	        
	    Q2(L1,k);
	    
	}
	public static void Q2(LinkedList<Integer> L1, int k) {
		
		LinkedList<ArrayList<Integer>> L2 = new LinkedList<>();
		for (int i = 0; i <L1.size()-1; i++) {
			ArrayList<Integer> pair = new ArrayList<>();
				if (k == (L1.get(i)+L1.get(i+1))) {
					pair.add(L1.get(i));
					pair.add(L1.get(i+1));
					L2.add(pair);
				}
				
			}
		System.out.println(L2);
		}
		
	}
