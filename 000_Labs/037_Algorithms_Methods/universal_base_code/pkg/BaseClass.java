/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public void toStringArray(int [] a){
	int len = a.length;
	for(int c = 0; c < len; c++){
		System.out.println(a[c]);
	}
}
public int getArrayMax(int [] a){
	int max;
	for(int c = 0; c < a.length; c++){
		if(a[c] > max){
			max = a[c];
		}
	}
	return max;
}
public int getArrayMin(int [] a){
	int min = Integer.MAX_VALUE;
	for(int c = 0; c < a.length; c++){
		if(a[c] < min){
				min = a[c];
		}
	}
	return min;
}

public int getArrayAverage(int[]a){
	int count = 0;
	for(int c = 0; c < a.length - 1; c += a[c]){
		count = c;
	}
	return count;

		
}

public class BaseClass {
	int example = 0;

	public BaseClass() {
		
		
	}

}

