package epic;

import java.util.ArrayList;
import java.util.List;

public class AdditiveNumbers {
	public static List<Long> findNumbers(long start, long end){
		List<Long> res = new ArrayList<Long>();
		StringBuilder sb = new StringBuilder();
		int digits = (end + "").length();
		System.out.println(digits);
		for(long i = 1; (i + "").length() < digits / 2; i++){
			for(long j = 0; (j + "").length() < digits/2; j++){
				sb = new StringBuilder();
				sb.append(i).append(j).append(i + j);
				long current = Long.parseLong(sb.toString());
				long first = i, second = j;
				while (current <= end){
					if (current >= start){
						res.add(current);
					}
					long tmp = first;
					first = second;
					second = tmp + second;
					sb.append(first + second);
					current = Long.parseLong(sb.toString());
				}
				//System.out.println(i);
			}
			//.out.println(i);
		}
		return res;
	}
	
	public static void main(String args[]){
		List<Long> res = findNumbers(100, 10000);
		System.out.println(res.toString());
	}
}
