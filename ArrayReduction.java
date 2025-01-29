//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joshua Vento-Jones

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class ArrayReduction
{
	// @param int array r to be reduced to a single value with the minimum cost.
	// @return The minimum cost, found by finding the two smallest values and their sum until the queue has 1 value.
	public static int min_cost( int[] r )
	{
		int cost = 0;
		PriorityQueue queue = new PriorityQueue();
		
		for(int num : r) {
			queue.add(num);
		}
		
		while(queue.size()>1) {
			int sum = (int)queue.poll();
			sum += (int)queue.poll();
			cost += sum;
			queue.add(sum);
		}
		return cost;
	}
	
	// Main method given by GitHub assignment (test cases)
	public static void main( String[] args )
	{
		int[] s0 = {212};
		System.out.println( ArrayReduction.min_cost(s0));
		
		int[] s1 = {25,10,20};
		System.out.println( ArrayReduction.min_cost(s1));		
			
		int[] s2 = {1,2,3};
		System.out.println( ArrayReduction.min_cost(s2));	
			
		int[] s3 = {1,2,3,4,7,22,33,54,-66,3,4,5,76,7,999};
		System.out.println( ArrayReduction.min_cost(s3));	
			
		int[] s4 = {1,1,1,1,1};
		System.out.println( ArrayReduction.min_cost(s4));	
			
		int[] s5 = {1,1};
		System.out.println( ArrayReduction.min_cost(s5));												
	}
}


/* EXPECTED OUTPUT
0
85
9
947
12
2
*/
