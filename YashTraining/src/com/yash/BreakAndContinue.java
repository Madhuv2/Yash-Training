package com.yash;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		for(int i=1; i<=5; i++) {
			
			for(int j=1;j<3;j++) {
				if(i==j) {
				break;
				}
				
				System.out.println(i +" "+j);
			}
		}

		
		System.out.println("------------------------");
		
		for(int i=1; i<5;i++) {
			for(int j=0;j<=3;j++) {
				if(i==2&&j==2) {
					continue;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
