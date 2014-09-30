package epic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintPhoneNumbers {
	public static void print(List<Character> set, int n, int pos, StringBuilder p,List<String> res){
		if (pos == n){
			res.add(p.toString());
			return;
		}
		
		for ( int i = 0; i < set.size(); i++){
			char prev = '\0';
			char first = '\0';
			if ( p.length() != 0){
				prev = p.charAt(pos - 1);
				first = p.charAt(0);
			}
			if ( set.get(i) == prev){
				continue;
			}
			if ( p.length() != 0 && first != '4' && set.get(i) == '4'){
				continue;
			}
			p.append(set.get(i));
			print(set, n, pos + 1, p, res);
			p.deleteCharAt(p.length() - 1);
		}
	}
	public static void main (String args[]){
		Character[] num = {'0','1','3','4','5','6','8'};
		int n = 8;
		ArrayList<Character> set = new ArrayList<Character>(Arrays.asList(num));
		StringBuilder p = new StringBuilder();
		ArrayList<String> res = new ArrayList<String>();
		print(set, n, 0, p, res);
		System.out.println(res);
	}
}
