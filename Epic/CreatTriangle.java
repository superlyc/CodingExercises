package epic;

/*
 * Given a array 
{{ 4,7,3,6,7}} 

construct a triangle like 
{{81}} 
{{40,41}} 
{{21,19,22}} 
{{11,10,9,13}} 
{{ 4,7,3,6,7}}
 */

import java.util.ArrayList;
import java.util.Arrays;

public class CreatTriangle {
	public static ArrayList<ArrayList<Integer>> creatTriangle(int[] A){
		int n = A.length;
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> line = new ArrayList<Integer>();
		for (int j = 0; j < n; j++){
			line.add(A[j]);
		}

		int i = n;
		while(i >= 1){
			res.add(0,line);
			ArrayList<Integer> nextline = new ArrayList<Integer>();
			for ( int j = 0; j < line.size() - 1; j++){
				nextline.add(line.get(j) + line.get(j+1));
			}
			line = nextline;
			i--;
		}
		return res;
	}
	
	public static void main(String args[]){
		int[] A ={4,7,3,6,7};
		ArrayList<ArrayList<Integer>> res = creatTriangle(A);
		System.out.println(res);
	}
}
