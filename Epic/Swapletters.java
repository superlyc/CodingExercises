package epic;

import java.util.Arrays;

public class Swapletters {
	public static void swap(String a, String b){
		int n = a.length();
		int i , j;
		i = 0;
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		while ( i < n ){
			while( i < n && aArr[i] == bArr[i]){
				i++;
			}
			j = i;
			while(j < n && aArr[i] != bArr[i]){
				char tmp = aArr[i];
				aArr[i] = aArr[j];
				aArr[j] = tmp;
				j++;
				System.out.println(new String(aArr));
			}
			i++;
		}
	}
	public static void main (String args[]){
		String a = "ACADBB123";
		String b = "DC1BA32BA";
		
		swap(a,b);
	}
}
