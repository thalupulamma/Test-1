package com.test;

public class InsertVsMergeCodePerformance {

	double n = 2;
	int count = 1;
	public void performaction() {
		//boolean result = true;
		/*System.out.println(n);
		System.out.println(compute(n));
		System.out.println(n);*/
		/*result = compute(n);
		while(result){  
			result = compute(n);
			n = n+1;
	    }*/  
		
		/*result = compute(n);
		if(result) {
			compute(n);
		}
		else {
			System.out.println("The value is:"+n);
		}*/
		
		n = computethis(n);
		System.out.println("The value is:"+n);
	}
	
	
	private double computethis(double n) {
		//System.out.println(n);
		System.out.println(8*n*n);
		System.out.println(64 * n * Log2n(n));
		return (((8*n*n) <= (64 * n * Log2n(n))) ? computethis(n+1) : n);
		
		/*int i = n;
		if((8*i*i) < (64 * n * Log2n(i) )) {
			i = i+1;
			System.out.println(count);
			count = count+1;
			computethis(i);
		}
		return count;*/
	}


	static double Log2n(double n)
    {
        return (n > 1) ? 1 + Log2n(n / 2) : 0;
    }
	
	static Boolean compute(int n) {
		System.out.println(n);
		System.out.println(8*n*n);
		System.out.println(64 * n * Log2n(n));
		
		if((8*n*n) < (64 * n * Log2n(n) )) {
			return true;
		}
		else {
			return false;
		}
			
	}
}
