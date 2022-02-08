package Solutions;

import java.util.*;

public class Ques07 {

	public static void main(String[] args) {
		Queue<Integer> Que = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the Queue: ");
		int size = input.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements: ");
			Que.add(input.nextInt());
		}
		Q7(Que,size);
		input.close();
	}
	
	public static void Q7(Queue<Integer> Q1, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + Q1.poll()*(int)(Math.pow(2, i));
		}
		System.out.println(sum);
	}

}