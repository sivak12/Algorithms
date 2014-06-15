package com.solution;

public class Sumpair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[]{1,2,3,4,5,6};
		int i = 0,j = list.length - 1;
		int sum, count=0,giv_sum=13;
		while(i<j) {
			sum = list[i] + list[j];
			if(sum < giv_sum) {
				i++;
			}
			else if(sum > giv_sum) {
				j--;
			}
			else {
				i++;
				j--;
				count ++;
			}
		}
		System.out.println("No of Pairs:"+count);
	}
		
		
		
		
}


