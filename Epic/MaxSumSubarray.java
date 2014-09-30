package epic;
/*
 * Find the largest sum contiguous sub array. 
 * The length of the returned sub array must be at least of length 2.
 */

public class MaxSumSubarray {
	public static int subarray(int[] A){
		if ( A.length < 2){
			return 0;
		}
		int max_ending_here = A[0] + A[1];
		int max_so_far = max_ending_here;
		//int prev = A[0];
		int start = 0;
		int tmpstart = start;
		int end = 0;
		for (int i = 2; i < A.length; i++){
			if (max_ending_here < 0){
				max_ending_here = A[i-1] + A[i];
				tmpstart = i-1; // potential start posistion. If max_so_far changed, then start = tmpstart
			}else{
				if (max_ending_here + A[i] > A[i-1] + A[i]){
					//tmpstart = start;
					max_ending_here = max_ending_here + A[i];
				}else{
					tmpstart = i - 1;
					max_ending_here = A[i-1] + A[i];
				}

			}
			if (max_so_far < max_ending_here){
				max_so_far = max_ending_here;
				start = tmpstart;
				end = i;
			}

		}
		System.out.println(start);
		System.out.println(end);
		return max_so_far;
	}
	public static void main(String args[]){
		int[] A =  {1,-2,3,-7,-1,1,2};
		System.out.println(subarray(A));
	}
}
