package Solutions;

import java.util.*;

public class Ques09 {

	public static void main(String[] args) {
		Queue<Integer> Queue = new LinkedList<>();
		Queue<Integer> Queue_even = new LinkedList<>();
		Queue<Integer> Queue_odd = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of Queue :");
		int len = input.nextInt();		
		System.out.println("Enter the list of Integers for Queue :");
		for(int i=1; i<=len;i++) 
		{
			Queue.add(input.nextInt());
		}		
		Queue<Integer> Q_dup = new LinkedList<>(Queue);
		for(int e : Q_dup) 
		{
			if(e%2==0) {
					Queue_even.add(e);	
			}else{
					Queue_odd.add(e);				
				}
		}
		List<Integer> A = new ArrayList<Integer>(len);			
		for(int i=0;i<len;i++) 
		{
				if(A.size()<len) 
				{
					if(!Queue_even.isEmpty()) 
					{
						A.add(Queue_even.poll());
					}
					if(A.size()<len) 
					{
						if(!Queue_odd.isEmpty()) 
						{
							A.add(Queue_odd.poll());	
						}
					}
				}
		}
		System.out.println("Output : " + A);
		input.close();
	}
}