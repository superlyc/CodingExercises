//Assume you have 3,7,16 and you can use as many as you want to add up to a target value;
//find the minimum total number of elements to use and give a solution or return 0 if no combination for this target value
package epic;

import java.util.Arrays;

public class Backpack {
	public static void main (String args[]){
		 int target  = 26;
		 int[] elem = {3, 7, 16};
		 int[] num = new int[target+1]; // number of elements to use to add up to the target, MAX_VALUE is no combinatino found
		 int[] elem_to_use = new int[target+1]; // at target value which is the first elemement to use
		 int[] num_of_elem = new int[elem.length]; // store num of each elememtn to be used
		 Arrays.sort(elem);

		 num [0] = 0;
		 elem_to_use[0] = 0;
		 for( int i = 1; i <= target; i++){
			 num[i] = Integer.MAX_VALUE;
			 //System.out.println("i" + i);
			 for( int j = 0; j < elem.length; j++){
				 if(i < elem[j]){
					 break;
				 }
				 if(num[i - elem[j]] != Integer.MAX_VALUE && (num[i - elem[j]]+1) < num[i]){
					 num[i] = num[i- elem[j]] + 1;

					// System.out.println("j"+j);
					 elem_to_use[i] = j;
				 }
			 }
			 //System.out.println("num["+i+"]"+num[i]);
		 }
		// System.out.println(Arrays.toString(count));
		// System.out.println(num[3]);
		 if ( num[target] != Integer.MAX_VALUE){
			 int i = target;
			 while ( i > 0){
				 num_of_elem[elem_to_use[i]] ++;
				 i = i - elem[elem_to_use[i]];
			 }
			 System.out.println(Arrays.toString(num_of_elem)); // out put the solution
		 }
		
	}
}
