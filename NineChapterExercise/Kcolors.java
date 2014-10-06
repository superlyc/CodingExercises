package partions;

import java.util.Arrays;

//k colors represented by 1~k, 
	//separate them so the same colors will be together in th array


public class Kcolors {
	
	public static void separatKcolors(int[] A, int range1, int range2, int start, int end){
		//System.out.println("Start" + start);
		//System.out.println("end" + end);
		int p = partition(A,start, end, (range1 + range2) / 2);
		//System.out.println("p" + p);

		
		if(p >= end ){
			return;
		}
		separatKcolors(A, range1, (range1 + range2) / 2, start, p - 1);
		separatKcolors(A, (range1 + range2) / 2 + 1, range2,  p, end);
	}
	public static int partition(int[] A, int start, int end, int pivot){
		while(start < end){
			if(A[start] > pivot){
				//System.out.println("Start" + start);
				//System.out.println("end" + end);
				swap(A, start, end);
				end--;
			}else{
				start++;
			}
		}
		if(A[start] <= pivot){
			return start + 1;
		}else{
			return start;
		}
	}
	public static void swap(int[] A, int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	public static void main(String args[]){
		int[] A ={1,2,3,1,4, 2,4, 3, 4, 1, 5,2,3};
		separatKcolors(A, 1, 5, 0, A.length - 1);
		System.out.println(Arrays.toString(A));
	}

}
