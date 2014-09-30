package epic;
/*
 * Let the user enter a decimal number. The range allowed is 0.0001 to 0.9999. Only four decimal places are allowed. The output should be an irreducible fraction. 
Eg: If the user enters 0.35, the irreducible fraction will be 7/20.
 */

public class IrreducibleFraction {
	public static void fraction(double decimal){
		int numerator = (int) (decimal * 10000);
		int dominator = 10000;
		int r = commonfactor(dominator, numerator);
		if ( r == 0){
			System.out.println(0);
			return;
		}
		int new_numerator = numerator / r;
		int new_dominator = dominator / r;
		
		System.out.println(new_numerator + "/" + new_dominator);
	}
	public static int commonfactor(int a, int b){

		if(a < b){
			int tmp = a;
			a = b;
			b = tmp;
		}
		if ( b == 0){
			return 0;
		}
		int r = b;
		while ( a % b != 0){
			r = a % b;
			a = b;
			b = r;
		}
		return r;
	}
	
	public static void main (String args[]){
		double input = 0;
		int i = 0; 
		while( i < 100){
		 fraction ((double) i/100);
		 i += 1;
		}
	}
	
}
