package testtt.test;

import java.util.*;

public class Exam1 {

	public static void main(String[] args) {
	
	
			 
		ArrayList<Integer> array = new ArrayList<>();
		
		int[] arr1 = { 7, 3, 2, 2};
		int[] arr2 = {3, 5, 5, 2, 1, 2, 1, 1, 8};
		int[] arr3 = {3, 5, 3, 5, 7, 5, 7};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		
		//중복
		ArrayList<Integer> no = new ArrayList<>();
	  
		
//		for(int num : arr1) {
//			if(!array.contains(num)) {
//				array.add(num);
//				
//			}else if(array.contains(num)) {
//				for(int i=0 ;i<array.size();i++) {
//					if(array.get(i)==num) {
//						array.remove(i);
//					}
//					
//				}
//			}
//			
//		}
		System.out.println("----------");
		
		for(int num : arr3) {
			if(!array.contains(num)) {
				if(!no.contains(num))
				array.add(num);
				
			}else if(array.contains(num)) {
				for(int i=0 ;i<array.size();i++) {
					if(array.get(i)==num) {
						array.remove(i);
						no.add(num);
						
					}
					
				}
			}
			
		}
		if(array.size()==0) {
			array.add(-1);
		}
		Arrays.sort(arr3);
		
		for(int i=0; i<array.size();i++) {
			System.out.println(array.get(i));
		}
		
	
		
		
		
		
		
//arrays.sort();
		
		
		
		
		

	}

}
