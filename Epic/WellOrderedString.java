package epic;
/*
 * A string 'aBlY' is said to be well ordered because the letters of the string occur one after the other in the alphabet. Write a function where the number of letters in the string are 
 * passes as parameter and all such well ordered strings are found.
 */
import java.util.ArrayList;

public class WellOrderedString {
	public static ArrayList<String> wellOrderedString(int n){
		
		char[] alph = new char[26];
		for ( int  i = 0; i < alph.length; i++){
			alph[i] = (char) ('a' + i);
		}
		String s = "";
		ArrayList<String> res = new ArrayList<String>();
		helper(n, alph, 0, s, res );
		return res;
		
	}
	public static void helper(int n, char[] alph, int pos, String s, ArrayList<String> res ){
		
		if (n == 0){
			String a = new String(s);
			//a = s;
			//System.out.println(a);
			res.add(a);
			return;
		}
		//System.out.println(n);
		for (int i = pos; i < alph.length; i++){
			s += alph[i];

			helper(n - 1, alph, i+1, s, res);
			s = s.substring(0,s.length() - 1);
		}
		
		return;
		
	}
	public static void main (String args[]){
		int n = 3;
		
		System.out.println(wellOrderedString(n));
	}
}
