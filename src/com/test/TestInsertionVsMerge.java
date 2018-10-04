package com.test;

public class TestInsertionVsMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int n=2; n<= 43; n++) {
			System.out.println(n);
			System.out.println(8*(int)(Math.log(n) / Math.log(2)));
			
			if((n) <= (8*(int)(Math.log(n) / Math.log(2)))) {
				System.out.println("a is great for n="+ n);
			}else {
				System.out.println("b is great for n="+ n);
			}
		}*/
		
		
		for(int n=2; n<= 49; n++) {
			//System.out.println(n);
			//System.out.println(Log2n(n));
			System.out.println(8*n*n);
			System.out.println(64*n*Log2n(n));
			
			if((8*n*n) <= (64*n*Log2n(n))) {
				System.out.println("a is great for n="+ n);
			}else {
				System.out.println("b is great for n="+ n);
			}
		}
	}
	
	
	static float Log2n(float n)
    {
        return (n > 1) ? 1 + Log2n(n / 2) : 0;
    }

}
