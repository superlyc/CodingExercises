package epic;

public class Solution {
	public static boolean whowin(boolean[] A){
		int n = A.length;
		int i = 0;
		int red = 0;
		int black = 0;
		while ( i < n - 1){
			boolean tmp = A[i];
			int j = i;
			while ( i < n - 1 && A[i] == A[i+1]){
				i++;
			}
			if ( i - j + 1 >= 3 ){
				if (A[i]){
					red += 3;
				}else{
					black += 3;
				}
			}
			i++;
		}
		
		return red > black;
	}
	public static void main(String args[]){
		boolean[] A = {false, false, true, true, true, true, true, false};
		System.out.println(whowin(A));
	}
}
